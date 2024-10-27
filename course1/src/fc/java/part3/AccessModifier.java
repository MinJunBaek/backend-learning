package fc.java.part3;

import fc.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO();
        dto.name = "홍길동";
        // dto.age = 1000; // 접근불가
        dto.phone = "010-1234-5678";
    }
}