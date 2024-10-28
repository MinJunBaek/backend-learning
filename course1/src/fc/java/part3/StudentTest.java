package fc.java.part3;

import fc.java.model.StudentVO;

public class StudentTest {
    public static void main(String[] args) {
        // 정수 6개를 저장할 배열을 생성하세요.
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 잘 설계된 학생 객체를 설계하고 데이터를 저장 한 후 출력하세요.
        StudentVO vo = new StudentVO("홍길동", "컴퓨터공학과", 37, "bit@empas.com", 2023110, "010-1234-5678");
        System.out.println(vo);
    }
}