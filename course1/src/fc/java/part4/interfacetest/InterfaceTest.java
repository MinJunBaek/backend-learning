package fc.java.part4.interfacetest;

import fc.java.part4.interfacetest.poly.*;

public class InterfaceTest {
    public static void main(String[] args) {
        // 리모콘으로 Radio와 TV를 동작시켜보자.
        // 다형성이 100%보장이 된다.
        // 부모가 인터페이스이면 자식의 내부 동작방식을 전혀 몰라도 동작을 시킬수가 있다.
        // 인터페이스도 추상클래스와 마찬가지로 객체를 생성할수 없고 상위클래스 역할만 할수 있다.
        RemoCon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();

        remo = new TV();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();
        // 정확하게 동작이 된다.
    }
}
