package ch03_operation;

public class OperTest4 {

    public static void main(String[] args) {
        int a = 0;
        a = (-1 > 0)? -1 : 1; // 조건이 참이면 -1, 아니면 1
        System.out.println(a);

        a = (-1 < 0) ? -1 : 1;
        System.out.println(a);

        int score = 85;
        char grade = (score > 90)? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(grade);
    } // main
    
}
