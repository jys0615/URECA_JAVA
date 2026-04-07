package ch03_operation;

public class OperTest3 {
    public static void main(String[] args) {
        int a = 123, b = 4;
        System.out.println("a == b : " + (a == b) );
        System.out.println("a != b : " + (a != b) );
        System.out.println("a > b : " + (a > b));
        System.out.println("a >= b : " + (a >= b) );
        System.out.println("a < b : " + (a < b) );
        System.out.println("a <= b : " + (a <= b) );
        System.out.println("\n");
        System.out.println("true & true: " + (-1 < 0 & 1 > 0));
        System.out.println("true & false: " + (-1 < 0 & 1 < 0));
        System.out.println("false & true: " + (-1 > 0 & 1 > 0));
        System.out.println("false & false: " + (-1 > 0 & 1 < 0));
        System.out.println("=================================");
        System.out.println("true | true: " + (-1 < 0 | 1 > 0));
        System.out.println("true | false: " + (-1 < 0 | 1 < 0));
        System.out.println("false | true: " + (-1 > 0 | 1 > 0));
        System.out.println("false | false: " + (-1 > 0 | 1 < 0));
        System.out.println("=================================");
        System.out.println("true ^ true: " + (true ^ true)); // 서로 다르면 참, 같으면 거짓.
        System.out.println("true ^ false: " + (true ^ false));
        System.out.println("false ^ true: " + (false ^ true));
        System.out.println("false ^ false: " + (false ^ false));
    } // main
} // class
