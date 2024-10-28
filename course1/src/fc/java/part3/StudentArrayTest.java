package fc.java.part3;

import fc.java.model.StudentVO;

public class StudentArrayTest {
    public static void main(String[] args) {
        StudentVO[] std = new StudentVO[4];
        std[0] = new StudentVO("홍길동", "컴공", 33, "bit@empas.com", 2023110, "010-1111-1111");
        std[1] = new StudentVO("나길동", "전기", 43, "bit@empas.com", 2023111, "010-2222-2222");
        std[2] = new StudentVO("김길동", "건축", 25, "bit@empas.com", 2023112, "010-3333-3333");
        std[3] = new StudentVO("이길동", "통신", 51, "bit@empas.com", 2023113, "010-4444-4444");

        for (StudentVO st : std) {
            // .toString()은 생략이 가능하다.
            System.out.println(st.toString());
        }

        System.out.println();

        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i]);
        }
    }
}