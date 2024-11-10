package fc.java.model2;

// 구현체를 새로운 클래스로 구현하는 방법
// 인터페이스를 구현한 구현체를 외부에 만들어 놓고 사용하는 방법
public class MathOperationImpl implements MathOperation{
    @Override
    public int operation(int x, int y) {
        return x + y;
    }
}
