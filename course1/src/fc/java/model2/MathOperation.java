package fc.java.model2;

@FunctionalInterface // 함수형 인터페이스 : 추상메서드를 한개만 가지고 있는 인터페이스
public interface MathOperation {
    public int operation(int x, int y); // 추상메서드
}