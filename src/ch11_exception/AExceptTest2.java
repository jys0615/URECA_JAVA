package ch11_exception;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AExceptTest2 {

	public static void main(String[] args) {

		FileReader reader = null;
		try {
			reader = new FileReader("C:/URECA/ws-java/java250825/src/CH01/Start.java");
			int i = reader.read();
			while(i != -1) { // -1 : EOF : end of file
				System.out.print( (char) i );
				i = reader.read();
			} // while
		} catch(FileNotFoundException | EOFException e) { // 여러 Exception을 한 번에 처리
			System.out.println("FileNotFoundException");
		} catch(IOException e) {
			System.out.println("IOException");
		} catch(Exception e) { // Exception 처리 순서는 위에서부터 자식 아래쪽으로 갈 수록 부모
			System.out.println("Exception");
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("File Close Exception");
			} // try ~ catch
		} // finally

	} // main

} // class








