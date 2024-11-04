package fc.java.course2.part1;

import fc.java.model2.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력하세요.
        ArrayList list = new ArrayList(1); // 기본크기(10)
        list.add(new Book("자바", 15000, "한빛", "홍길동"));
        list.add(new Book("C++", 17000, "대림", "이길동"));
        list.add(new Book("Python", 16000, "정보", "나길동"));

        Book vo = (Book)list.get(0); // (Book)Object -> Book
        System.out.println(vo);

        // 배열의 크기를 자동으로 늘려주도록 되어있다.
        vo = (Book)list.get(1);
        System.out.println(vo);
        vo = (Book)list.get(2);
        System.out.println(vo);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Book) {
                // Object -> Book(jvm에서 자동으로 Book의 toString())
                System.out.println((Book) list.get(i));
                // 부모의 toString()이 자식의 클래스에서 재정의 했기때문에 자식의 toString()이 출력된다.
            }
        }
    }
}
