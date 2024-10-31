package fc.java.part4;

import fc.java.model.*;

public class OverrideTest {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.eat();
        Animal c = new Cat();
        c.eat();
    }
}