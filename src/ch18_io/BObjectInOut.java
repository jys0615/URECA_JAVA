package ch18_io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BObjectInOut {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// 1. out
		FileOutputStream fos
			= new FileOutputStream("C:/URECA/ws_java/a260406_java/src/ch18_io/obj.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject( new BSerialPerson("강감찬", 27) );
		oos.writeObject( new BSerialPerson("홍길동", 21) );
		oos.writeObject( new BSerialPerson("이순신", 25) );

		oos.close();
		fos.close();

		// 2. in
		FileInputStream fis
			= new FileInputStream("C:/URECA/ws_java/a260406_java/src/ch18_io/obj.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		BSerialPerson tmp = (BSerialPerson) ois.readObject();
		try {
			while( true ) {
				System.out.println( tmp.toString() );
				tmp = (BSerialPerson) ois.readObject();
			} // while
		} catch(EOFException e) {
			System.out.println("파일 읽기 종료");
		} finally {
			ois.close();
			fis.close();
		}

	} // main

}
