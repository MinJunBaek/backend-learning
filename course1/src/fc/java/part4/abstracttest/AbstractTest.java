package fc.java.part4.abstracttest;

import fc.java.part4.abstracttest.poly.*;

public class AbstractTest {
    public static void main(String[] args) {
        // 리모콘으로 Radio와 TV를 동작시켜보자.
        RemoCon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet(); // 오동작(Radio가 인터넷이 구동된다?)

        remo = new TV();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();
    }
}
