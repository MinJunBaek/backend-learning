package fc.java.part4;

import fc.java.model.*;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        // Upcasting(업케스팅) 부모가 자식을 가리킨다.
        Animal d = new Dog();
        d.eat();
        Animal c = new Cat();
        c.eat();
    }
}