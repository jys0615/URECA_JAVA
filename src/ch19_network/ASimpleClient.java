package ch19_network;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ASimpleClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("127.0.0.1", 54321); // server ip, port
		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		System.out.println( dis.readUTF() );

		dis.close();
		is.close();
		socket.close();

	} // main

}
