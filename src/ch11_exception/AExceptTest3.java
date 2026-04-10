package ch11_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AExceptTest3 {

	public static void main(String[] args) {

		// Exception 발생 여부와 관계 없이 자동으로 resource close.
		try(FileReader reader = new FileReader("C:/URECA/ws-java/java250825/src/CH01/Start.java")) {
			int i = reader.read();
			while(i != -1) { // -1 : EOF : end of file
				System.out.print( (char) i );
				i = reader.read();
			} // while
		} catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch(IOException e) {
			System.out.println("IOException");
		}
	} // main

}
