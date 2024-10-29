package fc.java.part3;

public class NoneStaticTest {
    public static void main(String[] args) {
        //
        int a = 10;
        int b = 20;
        /* 객체를 생성하고 메서드를 호출해야 한다. */
        NoneStaticTest n = new NoneStaticTest();
        int sum = n.hap(a, b);
        System.out.println(sum);
    }

    // 매개변수로 2개의 정수를 입력받아서 총합을 구하여 리턴하는 메서드 정의
    public int hap(int a, int b) {
        int v = a + b;
        return  v;
    }
}