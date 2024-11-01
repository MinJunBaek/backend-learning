package fc.java.part4;

import fc.java.poly.*;

public class ObjectPolyArg {
    public static void main(String[] args) {
        A a = new A();
        display(a);
        B b = new B();
        display(b);
    }

    // 다형성 인수 활용
    private static void display(Object obj) {
        if (obj instanceof A) {
            ((A) obj).printGo();
        } else {
            ((B) obj).printGo();
        }
    }
}
