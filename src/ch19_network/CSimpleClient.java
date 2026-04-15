package ch19_network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class CSimpleClient {

	public static void main(String[] args)
			throws UnknownHostException, IOException, ClassNotFoundException {

		Socket socket = new Socket("10.4.3.102", 54321);
		OutputStream os = socket.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject( new CChatObj("rih","hello~~~", null) );

		InputStream is = socket.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(is);
		CChatObj chat = (CChatObj) ois.readObject();
		System.out.printf("client - %s : (%s) %s\n"
				, chat.getDate(), chat.getName(), chat.getMessage());

		oos.close();	os.close();
		ois.close();	is.close();
		socket.close();

	} // main

}
