package fc.java.course2.part2;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        // ArrayList에 10, 20, 30, 40, 50 5개의 정수(int)를 저장하고 출력하세요
        // ArrayList는 Object[] 형태로써 int기본자료형을 넣을수가 없다.
        // ArrayList -> Object[] <--X--int
        // int형의 객체로 변환해서 넣어햐 한다.
        // ArrayList -> Object[] <--O--Integer(Wrapper)
        // ArrayList -> Object[] <--(Auto-boxing:Integer)-- int
        ArrayList<Integer> list = new ArrayList<>(); // Integer타입으로만 배열에 넣겠다는 선은
        list.add(new Integer(10));
        list.add(20); // Auto-boxing으로 인해 객체를 생성하지 않아도 int기본형을 받을수 있다.
        list.add(30);
        list.add(40);
        list.add(50);

        // int <-(Auto-unboxing)--Integer
        for (int data : list) {
            System.out.println(data);
        }
    }
}
