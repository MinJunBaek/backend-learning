package fc.java.part4;

import fc.java.model.*;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }

    // 타입이 늘어나면 display()메서드도 갯수가 늘어난다.
    /*
    public static void display(Dog d) {
        d.eat();
    }
    public static void display(Cat c) {
        c.eat();
    }
    */

    // 다형성 인수 : 하나의 타입(부모타입)으로 여러가지타입(자식타입)을 받을수 있다.
    public static void display(Animal ani) {
        ani.eat();
        /* Cat타입으로 받은 경우에만 실행 -> if
            ((Cat)ani).night();
         */
        if (ani instanceof Cat) {
            ((Cat) ani).night();
        }
    }
}