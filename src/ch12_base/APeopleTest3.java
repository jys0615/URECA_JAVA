package ch12_base;

public class APeopleTest3 {
    public static void main(String[] args) {

        APeople3 p1 = new APeople3("강감찬", 100, "M");
        APeople3 p2 = new APeople3("강감찬", 100, "M");
 
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.toString()); // ch12_base.APeople3[name=강감찬, age=100, gender=M] -> 클래스명[필드명=값, 필드명=값, ...]
        System.out.println(p2.toString()); // ch12_base.APeople3[name=강감찬, age=100, gender=M] -> 클래스명[필드명=값, 필드명=값, ...]     
        System.out.println(p1.hashCode()); // 결과는 다르지만, 실제로는 같은 문자열이므로 동일한 해시코드가 나와야 한다.
        System.out.println(p2.hashCode()); // 결과는 다르지만, 실제로는 같은 문자열이므로 동일한 해시코드가 나와야 한다.
    } // main
} // APeopleTest3
    