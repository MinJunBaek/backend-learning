package fc.java.poly;
// 추상클래스(불완전한 클래스)
public abstract class Animal {
    // 부모 메서드의 구현부가 필요없음
    // 추상메서드(불완전한 메서드) : 메서드의 구현부가 없다.
    // 추상클래스는 객체생성이 안된다.
    // 추상클래스에서 정의된 메서드를 하위 클래스에서 강제적으로 구현해야한다.
    // 추상메서드
    public abstract void eat();

    // 구현메서드
    public void move() {
        System.out.println("무리를 지어서 이동한다.");
    }
}