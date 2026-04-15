package ch19_network.chat;
/*******************************************
*        ChatServerThread.java                 *
*******************************************/

import java.io.*;
import java.util.*;

public class ChatServerThread implements Runnable{
    Vector buffer;
    ObjectInputStream ois;
    ObjectOutputStream oos;
    Data d;
    boolean exit;
    String name;

    public ChatServerThread(Vector v, ObjectInputStream ois , ObjectOutputStream oos) {
        this.buffer = v;
        this.ois = ois;
        this.oos = oos;
        exit = false;
    }

    public void run() {
        while(!exit) {
            try {
                d = (Data) ois.readObject();
            } catch (ClassNotFoundException e) {
                System.err.println("Data class를 찾을 수 없습니다.");
            } catch (OptionalDataException e1) {
                System.err.println("OptionalDataException 이 발생하였습니다.");
            } catch (IOException e3) {
                System.err.println("IOExcdetion이 발생하였습니다.");
            }
           
			int state = d.getState();      //상태정보 확인.....
            if(state == Data.접속종료) {
                exit = true;
                d.setMessage("님이 종료하셨습니다.");
                name = d.getName();
                broadCasting();
                for(int i = 0 ; i <buffer.size() ; i++) {
                    if( ((Data)buffer.elementAt(i)).getName().equals(name)) {
                        buffer.removeElementAt(i);
                        break;
                    }
                }
				try{
					ois.close();
					oos.close();
				}catch(IOException e){
					e.printStackTrace();
				}
		    } else if(state == Data.처음접속) {
                d.setOOS(oos);		//서버에서 broadcast할 oos를 처음 들어온 객체에 setting
                buffer.addElement(d);
                System.out.println("broadCasting 시작");
                broadCasting();
            } else {
                broadCasting();
            }
        }
    }

    public void broadCasting() {
        //Vector v = (Vector)buffer.clone();
        for(int i = 0 ; i < buffer.size() ; i++ ) {
            try {
                ((Data) buffer.elementAt(i)).getOOS().writeObject(d);
			} catch (IOException e) {
                System.err.println("broadCasting method에서 IOException이 발생하였습니다.");
                e.printStackTrace();
            }
        }
    }
}