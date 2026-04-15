package ch18_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EDataInOut {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos
			= new FileOutputStream("C:/URECA/ws_java/a260406_java/src/ch18_io/data.txt");
		DataOutputStream dos = new DataOutputStream(fos);

		dos.writeInt(777);
		dos.writeBoolean(false);
		dos.writeDouble(3.14);
		dos.writeUTF("nice to meet you~~~");

		dos.close();
		fos.close();

		FileInputStream fis
			= new FileInputStream("C:/URECA/ws_java/a260406_java/src/ch18_io/data.txt");
		DataInputStream dis = new DataInputStream(fis);

		System.out.println( dis.readInt() );
		System.out.println( dis.readBoolean() );
		System.out.println( dis.readDouble() );
		System.out.println( dis.readUTF() );

		dis.close();
		fis.close();

	} // main

}
