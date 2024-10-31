package fc.java.part4;

import fc.java.model.*;

public class ObjectCasting {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.eat();
        Animal c = new Cat();
        c.eat();
        // 동일한 메시지(호출)을 통해 자식에서 재정의한 메서드가 호출된다.
        // 동일한 메시지로 다양한 결과를 내는 이를 바로 다형성이라고 한다.

        // c.night(); 자식 고유의 메서드라서 부모로부터 호출될수 없다.
        // 다운케스팅을 해야 자식 고유의 메서드로 접근할수 있다.

        Cat x = (Cat) c;
        x.night();
        // 한줄로 표현 가능
        ((Cat) c).night(); // c를 다운케스팅을 한 후 .night()메서드에 접근
    }
}
