package fc.java.part3;

import fc.java.model.MyUtil1;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // Myutil1
        // 객체생성 후 접근
        MyUtil1 my1 = new MyUtil1();
        int sum = my1.hap(a, b);
        System.out.println(sum);
    }
}