package fc.java.part4.interfacetest.poly;
// 추상클래스 = 추상메서드 + 구현메서드
public interface RemoCon {
    /*  상수
        상수는 기본적으로 대문자로 표현
        public static final을 생략해도 되며
        public final static으로 바꾸어 써도 전혀 무방하다.  */
    int MAXCH = 99;
    public static final int MINCH = 1;

    // public abstract를 생략해도 된다. 묵시적으로 사용하기 때문
    public abstract void chUp();
    void chDown();
    void volUp();
    void volDown();
    void internet();
}