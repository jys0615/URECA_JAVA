package ch12_base;

public class APeopleTest {
    public static void main(String[] args) {

        APeople p1 = new APeople("강감찬");
        APeople p2 = new APeople("강감찬");
 
        System.out.println(p1.equals(p2)); // false
        System.out.println(p1.toString()); // ch12_base.APeople@15db9742 -> 클래스명@16진수 해시코드
        System.out.println(p2.toString()); // ch12_base.APeople@6d06d69c -> 클래스명@16진수 해시코드
        System.out.println(p1.hashCode()); // 결과는 다르지만, 실제로는 같은 문자열이므로 동일한 해시코드가 나와야 한다.
        System.out.println(p2.hashCode()); // 결과는 다르지만, 실제로는 같은 문자열이므로 동일한 해시코드가 나와야 한다.
        // 해시코드가 같다고 같은 객체라 판별하면 안된다. 해시코드가 리턴하는 정수값과, 이름도 같다고 판별해야 같은 객체라고 할 수 있다.
        // 우리가 만드는 클래스는 오버라이드를 해야 한다. equals()와 hashCode()를 오버라이드 해야 한다. toString()도 오버라이드 하는 것이 좋다.
        // 오버라이드란? 부모 클래스의 메소드를 자식 클래스에서 재정의 하는 것. 부모 클래스의 메소드를 자식 클래스에서 다시 작성하는 것. 부모 클래스의 메소드를 자식 클래스에서 덮어쓰는 것.
    } // main
}
