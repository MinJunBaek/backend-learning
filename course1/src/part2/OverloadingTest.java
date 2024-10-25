package fc.java.part2;

public class OverloadingTest {
    public static void main(String[] args) {
        // 정적 바인딩으로 인해 메서드 호출시 인자값의 데이터타입에 따라 해당하는 메서드를 호출하게됨
        float v = sum(35.6f, 56.7f);
        System.out.println("v = " + v);

        int vv = sum(10, 50);
        System.out.println("vv = " + vv);
    }

    // 매개변수로 두개의 정수값을 받아서 총합을 구하여 리턴하는 메서드 정의
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // 매개변수로 두개의 실수값을 받아서 총합을 구하여 리턴하는 메서드 정의
    public static float sum(float a, float b) {
        float sum = a + b;
        return sum;
    }
}
