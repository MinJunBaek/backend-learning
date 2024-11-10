package fc.java.course2.part2;

import fc.java.model2.MathOperation;
import fc.java.model2.MathOperationImpl;

// 보통은 구현체를 따로 두어서 이렇게 구현하는게 일반적이다.
public class FunctionInterfaceTest2 {
    public static void main(String[] args) {
        // MathOperation 인터페이스를 내부 익명내부클래스로 구현해보자(외부구현체를 사용하지 않고 바로 사용)
        // 인터페이스는 존재하지만 구현클래스가 따로 존재하지 않는 익명내부클래스라고 한다.
        MathOperation mo = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return 0;
            }
        };
        int result = mo.operation(10, 20);
        System.out.println("result = " + result);
    }
}
