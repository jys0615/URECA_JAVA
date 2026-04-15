package ch19_network.chat;
/*******************************************
*         ChatClientThread.java                 *
*******************************************/

import java.io.*;

/**
    처음 Server에 접속하게 되면 ChatClient에 의해 만들어져 Start될 Thread. < br>
    Server측에서 Data Object를 받아서 ChatClient GUI에 Message를 뿌려주는
    일을 한다.
*/
public class ChatClientThread implements Runnable{
    ObjectInputStream ois;
    ChatClient cc;
    Data d;
    boolean exit = false;

    public ChatClientThread(ObjectInputStream ois, ChatClient cc) {
        this.ois = ois;
        this.cc = cc;
    }

    public void run() {
        while(!exit) {
            try {
                d = (Data) ois.readObject();
            } catch (IOException e) {
                System.err.println("run method IOException");
            } catch (ClassNotFoundException e1) {
                System.err.println("Data class NotFound");
            }
            String name = d.getName();
            cc.commList.append("[ " + name + " ]" + d.getMessage() + "\n");
        }
        try {
            ois.close();
        } catch (IOException e) {
            System.err.println(" ChatClientThread에의 ObjectOutputStream을 Close하는 중에 IOException이 발생하였습니다.");
        }
    }
}