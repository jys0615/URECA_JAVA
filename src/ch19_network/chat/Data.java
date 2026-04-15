package ch19_network.chat;
/*******************************************
*               Data.java                            *
*******************************************/

import java.io.*;

public class Data implements Serializable{

    private String message;  // Client 의 message를 저장하는 변수
    private String name; // Client 의 user name을 저장하는 변수
    private int state;  // Client의 상태를 저장하는 변수 ex) 처음 접속인지, 접속을 종료하려고 하는건지..
    private transient ObjectOutputStream oos;  //Server에서 Client에게 Object를 보낼 oos....

	public static final int 처음접속 = 0;
    public static final int 접속종료 = -1;
    public static final int 대화중 = 1;

    public Data (String name, String message, int state, ObjectOutputStream o) {
        this.name = name;
        this.message = message;
        this.state = state;
        this.oos = o;
    }

    public Data (String name, String message, int state) {
        this(name , message, state, null);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String s) {
        message = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    public int getState() {
        return state;
    }

    public void setState(int i) {
        state = i;
    }

    public ObjectOutputStream getOOS() {
        return oos;
    }

    public void setOOS(ObjectOutputStream o) {
        oos = o;
    }
}