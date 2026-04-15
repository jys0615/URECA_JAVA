package ch18_io;

import java.io.File;

public class CFile {

	public static void main(String[] args) {
		// File : 파일 또는 폴더를 지칭
		File f1 = new File("C:/URECA/ws_java/a260406_java/src");
		System.out.println( f1.exists() );
		System.out.println( f1.isDirectory() );
		System.out.println( f1.isFile() );
		System.out.println("===============================");

		File f2 = new File("C:/URECA/ws_java/a260406_java/src/ch18_io/text.txt");
		System.out.println( f2.isDirectory() );
		System.out.println( f2.isFile() );
		System.out.println( f2.canRead() );
		System.out.println( f2.canWrite() );
		System.out.println( f2.canExecute() );
		System.out.println("===============================");
		System.out.println( f2.getName() );
		System.out.println( f2.getPath() );
		System.out.println( f2.getAbsolutePath() );
		System.out.println( f2.getParent() ); // String 리턴
		System.out.println( f2.getParentFile() ); // File 객체 리턴
		System.out.println( f2.getParentFile().getName() ); // File 함수 사용 가능
		System.out.println("===============================");

		File f3 = f2.getParentFile();
		String [] strArr = f3.list();
		for (String string : strArr) {
			System.out.println(string);
		}
		System.out.println("===============================");

		File [] fileArr = f3.listFiles();
		for (File file : fileArr) {
			System.out.println(file);
		}

//		f2.delete();
		
	} // main

}
