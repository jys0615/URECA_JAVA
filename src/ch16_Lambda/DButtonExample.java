package ch16_Lambda;

public class DButtonExample {
	public static void main(String[] args) {
		//Ok 버튼 객체 생성
		DButton btnOk = new DButton();	
		
		//Ok 버튼 객체에 ClickListener 구현 객체 주입
		btnOk.setClickListener( ()->System.out.println("Ok 버튼을 클릭.") );
		
		//Ok 버튼 클릭하기
		btnOk.click();		
		
		//-------------------------------------------------------------------------------------------
		
		//Cancel 버튼 객체 생성
		DButton btnCancel = new DButton();
		
		//Cancel 버튼 객체에 ClickListener 구현 객체 주입
		btnCancel.setClickListener( ()->System.out.println("Cancel 버튼 클릭.") );
		
		//Cancel 버튼 클릭하기
		btnCancel.click();
	}
}
