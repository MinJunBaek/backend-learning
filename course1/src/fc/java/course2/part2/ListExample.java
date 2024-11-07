package fc.java.course2.part2;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("apple"));
        list.add("banana"); // 리터럴도 객체로 취급
        list.add("cherry"); // 리터럴도 객체로 취급
        list.add("banana"); // 리터럴도 객체로 취급
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(list.size() - 1)); // 마지막 요소를 꺼내는 방법 python처럼 (-1)은 안됨.

        System.out.println();
        list.remove(0);
        list.set(1, "orange"); // 삭제가 되면 남은 데이터의 인덱스가 변경된다( 0 <- 1 <- 2 <- 3 )

        for (String str : list) {
            System.out.println(str);
        }
    }
}
