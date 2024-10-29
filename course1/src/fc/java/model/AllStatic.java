package fc.java.model;

public class AllStatic {
    // 객체를 생성하지 못하게 private으로 생정자의 접근지정자를 지정해준다.
    private AllStatic(){}

    public static int hap(int a, int b) {
        int v = a + b;
        return v;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
