package fc.java.part3;

import fc.java.model.AllStatic;

public class AllStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        System.out.println(AllStatic.hap(a, b));
        System.out.println(AllStatic.max(a, b));
        System.out.println(AllStatic.min(a, b));
    }
}