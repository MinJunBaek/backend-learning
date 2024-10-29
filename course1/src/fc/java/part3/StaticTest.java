package fc.java.part3;

public class StaticTest {
    public static void main(String[] args) {
        //
        int a = 10;
        int b = 20;
        /* 일반적으로 static메서드는 앞에 클래스 이름을 기입하여 구분을 해준다. */
        int sum = StaticTest.hap(a, b);
        System.out.println(sum);
    }

    // 매개변수로 2개의 정수를 입력받아서 총합을 구하여 리턴하는 메서드 정의
    public static int hap(int a, int b) {
        int v = a + b;
        return  v;
    }
}
