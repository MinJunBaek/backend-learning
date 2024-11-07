package fc.java.course2.part2;

public class WrapperTest {
    public static void main(String[] args) {
        // 정수형 변수의 10을 저장하세요
        int a = 10;
        // Integer aa = new Integer(10);// 사용자 정의 자료형, new Integer(10)을 자동으로 boxing을 한다
        Integer aa = 10; // 자바 9버전 이후부터 이렇게 쓰는걸 지향한다. Auto-boxing
        System.out.println(aa.intValue()); // Unboxing(Integer -> int)

        Integer bb = new Integer(20);
        int b = bb; // Auto-Unboxing이 이루어진다.
        System.out.println(b);

        float f = 10.5f;
        Float ff = new Float(10.5f);
        Float ff1 = 45.6f; // new Float() 생략 Auto-boxing
        System.out.println(ff.floatValue());
        System.out.println(ff1.floatValue());

        Float af = 49.1f;
        float aff = af; // 객체타입에서 기본타입으로 포장을 벗기다(Auto-Unboxing 후 -> Auto-Boxing)
        System.out.println(af.floatValue());
        System.out.println(aff);
    }
}
