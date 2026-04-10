package ch11_exception;

public class BIDTest {

	public static void main(String[] args) {

		if(args.length != 2) {
			System.out.println("입력값 부족");
			return; // 프로그램 종료
		} // if

		String inputID = args[0];
		String inputPWD = args[1];

		BIDService service = new BIDService();
		try {
			service.checkID(inputID);
			service.checkPWD(inputPWD);
		} catch (BIDException e) {
			System.out.println(e.toString());
		}

	} // main

}

