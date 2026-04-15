package ch19_network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class CSimpleServer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ServerSocket serverSocket = new ServerSocket(54321);
		Socket socket = null;
		InputStream is = null;		ObjectInputStream ois = null;
		OutputStream os = null;		ObjectOutputStream oos = null;

		while(true) {
			socket = serverSocket.accept();
			is = socket.getInputStream();		ois = new ObjectInputStream( is );
			CChatObj chat = (CChatObj) ois.readObject();
			chat.setDate( new Date() );
			System.out.printf("server - %s : (%s) %s\n"
					, chat.getDate(), chat.getName(), chat.getMessage());

			os = socket.getOutputStream();		oos = new ObjectOutputStream( os );
			oos.writeObject(chat);

			ois.close();	is.close();
			oos.close();	os.close();
			socket.close();
		}

	} // main

}
