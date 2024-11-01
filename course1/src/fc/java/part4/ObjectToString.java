package fc.java.part4;

import fc.java.poly.*;

public class ObjectToString {
    public static void main(String[] args) {
        Board b = new Board();
        b.setTitle("게시글 입니다.");
        System.out.println(b.getTitle());
        System.out.println();
        System.out.println(b.toString()); // 번지가 출력
        System.out.println();
        System.out.println(b); // 재정의 하면 재정의한 문자열이 나옴.
    }
}
