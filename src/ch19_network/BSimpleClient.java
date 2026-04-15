package ch19_network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class BSimpleClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("127.0.0.1", 54321);
		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF( "(rjh) hello~~" );

		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		System.out.println( dis.readUTF() );

		dos.close();	os.close();
		dis.close();	is.close();
		socket.close();

	} // main

}
