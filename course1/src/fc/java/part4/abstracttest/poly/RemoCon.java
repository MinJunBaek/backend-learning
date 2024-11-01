package fc.java.part4.abstracttest.poly;
// 추상클래스 = 추상메서드 + 구현메서드
public abstract class RemoCon {
    public abstract void chUp();
    public abstract void chDown();
    public abstract void volUp();
    public abstract void volDown();
    // 추상클래스의 단점은 구현메서드를 만들수 있으므로써
    // 상속받은 하위클래스가 구현된 구현메서드가 맞지 않는경우 에러가 날수있다.
    public void internet(){
        System.out.println("인터넷이 구동된다.");
    }
}