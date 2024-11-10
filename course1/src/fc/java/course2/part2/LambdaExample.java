package fc.java.course2.part2;

import fc.java.model2.MathOperation;

public class LambdaExample {
    public static void main(String[] args) {
        // 익명내부함수형식으로 구현
        /* MathOperation add = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x + y;
            }
        };
         */
        // 람다식 표현
        // 변수타입, {}, return 생략 가능하다. 단, {}를 쓰면 return도 같이 써야한다.
        MathOperation add = (int x, int y) -> {return x+y;};
        MathOperation multi = (x, y) -> {return x * y;};
        int result = add.operation(10, 20);
        int multiresult = multi.operation(10, 20);
        System.out.println("result = " + result);
        System.out.println("multiresult = " + multiresult);

    }
}