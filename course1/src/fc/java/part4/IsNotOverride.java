package fc.java.part4;

import fc.java.poly.*;

public class IsNotOverride {
    public static void main(String[] args) {
        // 재정의를 하지 안했을 때
        // 다형성 보장하지 않음 -> 다형성을 보장하려면 재정의를 강제로 하도록 만들어준다. -> 추상클래스, 인터페이스

        Animal ani = new Dog();
        ani.eat(); // ?
        ani = new Cat();
        ani.eat(); // ?

    }
}
