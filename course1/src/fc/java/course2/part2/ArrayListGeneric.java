package fc.java.course2.part2;

import fc.java.model2.Book;

import java.util.*;

public class ArrayListGeneric {
    public static void main(String[] args) {
        List<Book> list = new ArrayList(); // Book[]로 컴파일시 만들어진다.
        // Object타입으로 인해서 모든 타입의 객체들이 들어와서 타입의 안정성보장이 어렵다.
        list.add(new Book("자바", 15000, "한빛", "홍길동"));
        list.add(new Book("C++", 17000, "대림", "이길동"));
        // list.add("Hello"); // 에러 발생

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
