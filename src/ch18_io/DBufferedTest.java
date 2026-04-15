package ch18_io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DBufferedTest {

	public static void main(String[] args) throws IOException {

		System.out.println("1. FileInputStream =================================");
		FileInputStream fis
			= new FileInputStream("C:/URECA/ws_java/a260406_java/src/ch18_io/text.txt");

		long milli1 = System.currentTimeMillis();

		int readInt = fis.read();
		while( readInt != -1 ) {
			System.out.print( (char) readInt );
			readInt = fis.read();
		} // while

		long milli2 = System.currentTimeMillis();
		System.out.println( "\n수행 시간 : " + (milli2 - milli1) );

		fis.close();

		System.out.println("\n2. BufferedInputStream =================================");
		fis = new FileInputStream("C:/URECA/ws_java/a260406_java/src/ch18_io/text.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);

		milli1 = System.currentTimeMillis();

		readInt = bis.read();
		while( readInt != -1 ) {
			System.out.print( (char) readInt );
			readInt = bis.read();
		} // while

		milli2 = System.currentTimeMillis();
		System.out.println( "\n수행 시간 : " + (milli2 - milli1) );

		bis.close();
		fis.close();

		System.out.println("\n3. InputStreamReader =================================");
		fis = new FileInputStream("C:/URECA/ws_java/a260406_java/src/ch18_io/text.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		milli1 = System.currentTimeMillis();

		readInt = br.read();
		while( readInt != -1 ) {
			System.out.print( (char) readInt );
			readInt = br.read();
		} // while

		milli2 = System.currentTimeMillis();
		System.out.println( "\n수행 시간 : " + (milli2 - milli1) );

		br.close();
		isr.close();
		fis.close();

		System.out.println("/n4. BufferedReader========================================");
		FileReader fr = new FileReader("C:/URECA/ws_java/a260406_java/src/ch18_io/text.txt");
		br = new BufferedReader(fr);

		milli1 = System.currentTimeMillis();

		int readInt2 = br.read();
		while( readInt2 != -1 ) {
			System.out.print( (char) readInt2 );
			readInt2 = br.read();
		} // while

		milli2 = System.currentTimeMillis();
		System.out.println( "\n수행 시간 : " + (milli2 - milli1) );

		br.close();
		fr.close();

//		1 : 14752700
//		2 : 3811000
//		3 : 2135400
//		4 : 1190800
	} // main

}
