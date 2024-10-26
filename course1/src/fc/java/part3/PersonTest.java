package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        Person p; // 객체 변수 선언
        p = new Person(); // 인스턴스 생성 및 인스턴스 변수 선언

        p.name = "백민준";
        p.age = 32;
        p.phone = "010-1234-1234";
        System.out.println("p.name = " + p.name);
        System.out.println("p.age = " + p.age);
        System.out.println("p.phone = " + p.phone);

        p.play();
        p.eat();
        p.walk();
    }
}