package ch19_network.chat;
/*****************************************
*             ChatServer.java              *
*******************************************/

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    Vector buffer;
    ServerSocket serverSocket;
    Socket socket;
    ObjectInputStream ois;
    ObjectOutputStream oos;

    public void service() {
        try {
            System.out.println("접속 준비중");
            serverSocket = new ServerSocket(5522);
        } catch (IOException e) {
            System.err.println("서비스 준비중에 IOException이 발생했습니다.");
        }
    
        while(true) {
            try {
                socket = serverSocket.accept();
                System.out.println(socket.getInetAddress() + "가 접속하셨습니다.");

                ois = new ObjectInputStream (socket.getInputStream());
                oos = new ObjectOutputStream(socket.getOutputStream());

                Thread t = new Thread(new ChatServerThread(buffer,ois,oos));
                t.start();
            } catch (IOException e) {
                System.err.println("IOException이 발생했습니다.");
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("Start Server Service...");
        ChatServer cs = new ChatServer();
        cs.buffer = new Vector(5,1);
        cs.service();
    }
}