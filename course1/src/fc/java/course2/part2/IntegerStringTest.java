package fc.java.course2.part2;

public class IntegerStringTest {
    public static void main(String[] args) {
        String str1 = "123"; // 숫자형 문자열
        String str2 = "123";
        System.out.println(str1 + str2); // 문자열
        int num = Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));

        int su1=123;
        int su2=123;
        // su1 + su2 = "123123"
        System.out.println(su1 + su2); // 덧셈이 이루어 진다.
        String str = String.valueOf(su1) + String.valueOf(su2); // 숫자를 문자열로 변환
        System.out.println(str);
        System.out.println(su1 + "" + su2); // 숫자를 문자열로 변환하는 또 다른 방법
    }
}
