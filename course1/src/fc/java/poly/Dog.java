package fc.java.poly;

public class Dog extends Animal {
    // 재정의를 하지 않을수 있으니 재정의를 강제로 할수 있게 해야함.
    @Override
    public void eat() {
        System.out.println("개처럼 먹다.");
    }
}