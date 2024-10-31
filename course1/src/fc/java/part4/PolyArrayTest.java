package fc.java.part4;

import fc.java.model.*;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        // Dog와 Cat을 저장하는 배열을 만들자? (다형성 배열)
        // Animal[] ani = {new Dog(), new Cat()};
        Animal[] ani = new Animal[2];
        ani[0] = d;
        ani[1] = c;
        // 굳이 메서드로 만들지 않아도 된다.
        display(ani);
    }

    public static void display(Animal[] ani) {
        for (int i = 0; i < ani.length; i++) {
            ani[i].eat();
            if (ani[i] instanceof Cat) {
                ((Cat)ani[i]).night();
            }
        }
    }
}