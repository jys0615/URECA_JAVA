package ch15_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BVectorExample {
	public static void main(String[] args) {
		//Vector 컬렉션 생성
//		List<BBoard> list = new ArrayList<>(); // 같은 번지에 두번 쓰는 경우 생김
		List<BBoard> list = new Vector<>(); // 같은 번지에 두번 쓰는 경우가 생기지 않음

		//작업 스레드 객체 생성
		Thread threadA = new Thread() {
			@Override
			public void run() {
				//객체 1000개 추가
				for(int i=1; i<=1000; i++) {
					list.add(new BBoard("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};

		//작업 스레드 객체 생성
		Thread threadB = new Thread() {
			@Override
			public void run() {
				//객체 1000개 추가
				for(int i=1001; i<=2000; i++) {
					list.add(new BBoard("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};

		//작업 스레드 실행
		threadA.start();
		threadB.start();

		//작업 스레드들이 모두 종료될때까지 메인 스레드를 기다리게함
		try {
			threadA.join(); // main 쓰레드를 기다리게 함
			threadB.join(); // main 쓰레드를 기다리게 함
		} catch(Exception e) {
		}

		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수: " + size);		

		for (BBoard bBoard : list) {
			System.out.println(bBoard.toString());
		}
	} // main

}
