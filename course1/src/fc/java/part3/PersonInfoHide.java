package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        // 한 사람의 회원 정보를 저장할 객체를 생성
        PersonVO p = new PersonVO();
        p.name = "홍길동";
        p.age = 5000;
        p.phone = "010-1234-5678";
        System.out.println(p.name + "\t" + p.age + "\t" + p.phone);
    }
}
