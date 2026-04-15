package ch19_network.chat;
/*******************************************
*            ChatClient.java               *
*******************************************/

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class ChatClient {
    Socket socket;
	ObjectOutputStream oos;
    ObjectInputStream ois;
    Thread t;
    Frame first , second;
    Label state , commLabel , serverLabel , IDLabel;
    TextArea commList;
    Button conn , transmission;
    TextField stateTextField , transTextField , serverTextField , IDTextField;
    String name;
    ChatClientThread cct;

    public void connection(String serverName , int port) throws IOException{
        socket = new Socket(serverName,port);
        System.out.println(serverName + "  에 접속되었습니다.");
     
        oos = new ObjectOutputStream( socket.getOutputStream() );
        ois = new ObjectInputStream( socket.getInputStream() );
        System.out.println("OutputStream을 열었습니다. ");

        Data d = new Data(IDTextField.getText(),"님이 접속하였습니다.",Data.처음접속);
        System.out.println("Stream 연결에 성공하였습니다.");
        oos.writeObject(d) ;

        cct = new ChatClientThread(ois,this);
        t = new Thread(cct);
        t.start();
    }

/**
    처음 보여질 GUI화면<br>
    Server의 이름과 User의 ID를 받아들여서, Connection Method를 호출한다.
*/
    public void firstGo() {
        first = new Frame("Chat Browser");
        first.addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                first.setVisible(false);
                first.dispose();
                System.exit(0);
            }
        });

        Panel p = new Panel();
        p.setLayout(new GridLayout(2,2));
        serverLabel = new Label("Server",Label.CENTER);
        IDLabel = new Label(" I   D ",Label.CENTER);
        serverTextField = new TextField(0);
        IDTextField = new TextField(0);

        p.add(serverLabel);
        p.add(serverTextField);
        p.add(IDLabel);
        p.add(IDTextField);
        conn = new Button("연결");
        conn.addActionListener( new ActionHandler());
        first.add(p,"Center");
        first.add(conn,"South");

        first.setSize(300,100);
        /* 화면의 중앙에 GUI가 보여질 수 있도록 하는 부분.
            현재의 Screen Size을 얻어온후 중앙부분에 Dispaly하도록 한다. */
        Dimension d = first.getToolkit().getScreenSize();
        first.setLocation(d.width/2 - first.getWidth()/2 , d.height/2 - first.getHeight()/2);
        first.setResizable(false);
        first.setVisible(true);
    }

/**
    두번째로 보여질 GUI<br>
*/
    public void secondGo() {
        second = new Frame("Chat v1.0 second");
        second.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frameClose(e);
            }
        });
        state = new Label("접속중...");
        state.setBackground(Color.darkGray);
        state.setForeground(Color.blue);
        second.add(state,"North");

        Panel p1 = new Panel();
        p1.setLayout(new BorderLayout());
        commLabel = new Label("대화내용",Label.CENTER);
        commList = new TextArea();
        commList.setEditable(false);
        p1.add(commLabel,"North");
        p1.add(commList,"Center");

        Panel p3 = new Panel();
        transTextField = new TextField(50);
        transTextField.addActionListener(new ActionHandler());
        transmission = new Button("전송");
        transmission.addActionListener(new ActionHandler());
        p3.add(transTextField);
        p3.add(transmission);

        second.add(p1,"Center");
        second.add(p3,"South");

        second.setSize(600,500);
        Dimension d = second.getToolkit().getScreenSize();
        second.setLocation(d.width/2 - second.getWidth()/2 , d.height/2 - second.getHeight()/2);
        second.setResizable(false);

        second.setVisible(true);
    }

    public void frameClose(WindowEvent e) {
        Frame f = (Frame) e.getSource();
        f.setVisible(false);
        f.dispose();
        cct.exit = true;
        try {
            oos.writeObject(new Data(name,"님이 나가셨습니다.",Data.접속종료));
            oos.close();
        } catch (IOException e1) {
            System.err.println("종료중 IOExcpetion이 발생하였습니다.");
        }
        System.exit(0);
    }

/*
    Acrtion Event를 처리하는 Inner class
*/
    public class ActionHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String actionCommand = e.getActionCommand();
            if(actionCommand.equals("연결")) {
                String server = serverTextField.getText();
                name = IDTextField.getText();
                first.setVisible(false);
                first.dispose();
                secondGo();
                try {
                    connection(server,5522);
                } catch (IOException e1) {
                    System.err.println("Connection 중 Exception이 발생하였습니다.");
                }
                state.setText("[ " + server +" ]" + " 에 접속되었습니다. --UserID : " + name);
            } else if ( actionCommand.equals("전송") || e.getSource() == transTextField) {
                try {
                    oos.writeObject(new Data(name,transTextField.getText(),Data.대화중));
                } catch (IOException e2) {
                    System.err.println("대화중 IOException이 발생하였습니다 ");
                }
                transTextField.setText("");
            }
        }
    }

    public static void main(String args[]) {
        ChatClient cc = new ChatClient();
        cc.firstGo();
    }
}