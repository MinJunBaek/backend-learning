package fc.java.course2.part2;

import fc.java.model2.*;

// 보통은 구현체를 따로 두어서 이렇게 구현하는게 일반적이다.
public class FunctionInterfaceTest1 {
    public static void main(String[] args) {
        MathOperation mo = new MathOperationImpl();
        int result = mo.operation(10, 20);
        System.out.println("result = " + result);
    }
}
