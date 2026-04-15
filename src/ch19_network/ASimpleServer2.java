package ch19_network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ASimpleServer2 {

	public static void main(String[] args) throws IOException {

		// ServerSocket : 접속 요청 대기, Socket : 통신을 위한 논리적 연결
		ServerSocket serverSocket = new ServerSocket(54321); // 54321 포트로 들어오는 요청을 기다린다
		Socket socket = null;
		OutputStream os = null;
		DataOutputStream dos = null;

		while(true) {
			socket = serverSocket.accept();
			os = socket.getOutputStream();
			dos = new DataOutputStream( os );

			dos.writeUTF("server connect.....");

			dos.close();
			os.close();
			socket.close();
		}

	} // main

}
