package fc.java.part3;

import fc.java.model.MyUtil;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = MyUtil.hap(a, b); // 스테틱 메서드를 사용하면 메서드의 이름이 15도 정도 기울어져 있다.
        System.out.println(sum);
    }
}
