package fc.java.part4;

import fc.java.poly.*;

public class ObjectTest {
    public static void main(String[] args) {
        // A객체를 Upcasting으로 생성.
        A a = new A();
        a.display();

        Object obj = new A();
        ((A)obj).display();
    }
}
