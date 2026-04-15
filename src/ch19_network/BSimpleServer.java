package ch19_network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BSimpleServer {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket(54321);
		Socket socket = null;
		InputStream is = null;		DataInputStream dis = null;
		OutputStream os = null;		DataOutputStream dos = null;

		while(true) {
			socket = serverSocket.accept();
			is = socket.getInputStream();		dis = new DataInputStream( is );
			String clientMessage = dis.readUTF();
			System.out.println("server : " + clientMessage);

			os = socket.getOutputStream();		dos = new DataOutputStream( os );
			dos.writeUTF( "server echo : " + clientMessage );

			dis.close();	is.close();
			dos.close();	os.close();
			socket.close();
		}

	} // main

}
