package fc.java.part4;

import fc.java.poly.*;

public class AbstractClassTest {
    public static void main(String[] args) {
        // 추상클래스는 단독으로 객체를 생성할수없다.
        // Animal ani = new Animal();
        // 추상클래스는 부모의 역할은 할수있다.
        Animal ani = new Dog();
        ani.eat();
        ani.move();

        ani = new Cat();
        ani.eat();
        ani.move();
        ((Cat)ani).night();
    }
}