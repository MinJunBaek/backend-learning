package fc.java.part3;

import fc.java.model.StudentVO;

public class ClassObjectInstance {
    public static void main(String[] args) {

        StudentVO st1; // 객체 변수 구분이 되지 않는다.... 가르키고있는 인스턴스가 없기 때문.
        StudentVO st2;
        StudentVO st3;

        st1 = new StudentVO("홍길동", "컴공", 37, "bit@empas.com", 20231110, "010-1111-1111"); // 인스턴스 변수 실제 인스턴스가 생기면서 서로 구분이 된다.
        st2 = new StudentVO("나길동", "컴공", 37, "bit@empas.com", 20231110, "010-1111-1111");
        st3 = new StudentVO("김길동", "컴공", 37, "bit@empas.com", 20231110, "010-1111-1111");

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
