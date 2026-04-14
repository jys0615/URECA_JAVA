package ch15_collection;

import java.util.Stack;

public class LStackExample {
	public static void main(String[] args) {
		//Stack 컬렉션 생성
		Stack<LCoin> coinBox = new Stack<>();
		
		//동전 넣기
		coinBox.push(new LCoin(100));
		coinBox.push(new LCoin(50));
		coinBox.push(new LCoin(500));
		coinBox.push(new LCoin(10));
		
		//동전을 하나씩 꺼내기
		while(!coinBox.isEmpty()) {
			LCoin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}
