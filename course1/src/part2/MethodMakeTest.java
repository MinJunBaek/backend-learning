package fc.java.part2;

public class MethodMakeTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        // add라는 메서드를 호출하여 두수의 합의 결과를 받아보자.
        int sum = add(a,b);
        System.out.println(sum);
    }
    public static int add(int a, int b) {
        int sum = a+b;
        return sum;
    }
}