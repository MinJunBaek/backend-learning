package fc.java.part4;

import fc.java.model.*;

public class PloyTest {
    public static void main(String[] args) {
        // Upcasting으로 객체를 생성
        // 상속관계, 재정의(자식클래스에서 메서드를 재정의 한것), 동적바인딩(실행 시점에서 사용될 메서드가 결정되는 바인딩)
        // 다형성 : 상위 클래스가 동일한 메시지로 하위 클래스를 서로 다르게 동작시키는 객체지향 원리
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();

        ((Cat) ani).night();

        // Overloading(오버로딩) : 정적바인딩(컴파일 시점에서 사용될 메서드가 결정되는 바인딩), 이름이 같은 메서드가 다른 인자값으로 다른 메서드를 호출
        // -> 프로그램의 실행 속도와는 무관
        // Override(재정의) : 동적바인딩(실행 시점에서 사용될 메서드가 결정되는 바인딩)
        // -> 프로그램의 실행 속도와 관계가 있다.
    }
}