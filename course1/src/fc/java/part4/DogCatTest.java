package fc.java.part4;

import fc.java.model.*;

public class DogCatTest {
    public static void main(String[] args) {
        // Dog 객체를 생성하고 eat()동작을 구동
        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();
    }
}