package ch06_class;

public class HCarExample {
	public static void main(String[] args) {
		//객체 생
		HCar myCar = new HCar();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도: " + myCar.getSpeed());
	}
}
