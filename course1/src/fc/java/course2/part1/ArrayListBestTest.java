package fc.java.course2.part1;

import fc.java.model2.Book;

import java.util.*;

public class ArrayListBestTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력하세요.
        ArrayList<Book> list = new ArrayList<Book>(); // 기본크기(10)
        // Object 타입이였던 배열이 Book타입만 받게 함으로써 Book타입 배열로 전환하게된다.
        // 따라서 <>제네릭은 해당 타입만 받을수 있게 된다. 그덕분에 다운케스팅을 할필요가 없다.
        list.add(new Book("자바", 15000, "한빛", "홍길동"));
        list.add(new Book("C++", 17000, "대림", "이길동"));
        list.add(new Book("Python", 16000, "정보", "나길동"));

        Book vo = list.get(0); // (Book)Object -> Book
        System.out.println(vo);

        // 배열의 크기를 자동으로 늘려주도록 되어있다.
        vo = list.get(1);
        System.out.println(vo);
        vo = list.get(2);
        System.out.println(vo);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
