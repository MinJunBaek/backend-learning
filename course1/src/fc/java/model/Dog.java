package fc.java.model;

public class Dog extends Animal{
    public Dog() {
        // int a = 10; // -> 부모객체 생성전에 수행문이 나올수가 없다.
        super();
    }

    @Override
    public void eat() {
        System.out.println("개처럼 먹다.");
    }
}