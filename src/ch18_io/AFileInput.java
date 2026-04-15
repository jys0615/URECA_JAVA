package ch18_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Input Stream : data source에서 프로그램으로 data를 가져 오는 것, ~InputStream, ~Reader
 * Output Stream : 프로그램에서 data destination으로 data를 가져 가는 것, ~OutputStream, ~Writer
 * 
 * Byte Stream : 입출력 단위가 8bit 기준, ~InputStream, ~OutputStream
 * Char Stream : 입출력 단위가 16bit 기준, ~Reader, ~Writer
 * 
 * Node Stream : data source 또는 data destination을 연결,
 * 					FileInputStream, FileOutputStream, FileReader, FileWriter
 * Filter Stream : data가 흐르는 동안 data 조작, data source 또는 data destination을 직접 연결 불가,
 * 					Node Stream과 함께 사용,
 * 					InputStreamReader, OutputStreamWriter,
 * 					DataInputStream, DataOutputStream,
 * 					ObjectInputStream, ObjectOutputStream
 * 
 * 주의!!! 노드 스트림과 필터 스트림 조합 시, 8bit끼리, 16bit끼리 조합
 * 주의!!! 반드시 close
 * 주의!!! close는 생성한 역순으로 close
 */
public class AFileInput {

	public static void main(String[] args) throws IOException {

		System.out.println("1. Byte Stream ====================================================");
		FileInputStream fis
			= new FileInputStream("C:/URECA/ws_java/a260406_java/src/ch18_io/text.txt");

		int readInt = fis.read();
		while( readInt != -1 ) {
			System.out.print( (char) readInt );
			readInt = fis.read();
		} // while
		fis.close();

		System.out.println("2. Char Stream ====================================================");
		FileReader fr = new FileReader("C:/URECA/ws_java/a260406_java/src/ch18_io/text.txt");

		int readInt2 = fr.read();
		while( readInt2 != -1 ) {
			System.out.print( (char) readInt2 );
			readInt2 = fr.read();
		} // while
		fr.close();

		System.out.println("3. Filter Stream ====================================================");
		FileInputStream fis3
			= new FileInputStream("C:/URECA/ws_java/a260406_java/src/ch18_io/text.txt");
		InputStreamReader isr = new InputStreamReader(fis3);

		int readInt3 = isr.read();
		while( readInt3 != -1 ) {
			System.out.print( (char) readInt3 );
			readInt3 = isr.read();
		} // while
		isr.close();
		fis3.close();

		System.out.println("4. Byte Stream ====================================================");
		FileInputStream fis4
		= new FileInputStream("C:/URECA/ws_java/a260406_java/src/ch18_io/text.txt");
		FileOutputStream fos4
		= new FileOutputStream("C:/URECA/ws_java/a260406_java/src/ch18_io/out.txt");

		int readInt4 = fis4.read();
		while( readInt4 != -1 ) {
			fos4.write(readInt4);
			readInt4 = fis4.read();
		} // while
		fis4.close();
		fos4.close();

		System.out.println("5. Char Stream ====================================================");
		FileReader fr5 = new FileReader("C:/URECA/ws_java/a260406_java/src/ch18_io/text.txt");
		FileWriter fw5 = new FileWriter("C:/URECA/ws_java/a260406_java/src/ch18_io/out5.txt");

		int readInt5 = fr5.read();
		while( readInt5 != -1 ) {
			fw5.write(readInt5);
			readInt5 = fr5.read();
		} // while
		fr5.close();
		fw5.close();

	} // main

} // class
