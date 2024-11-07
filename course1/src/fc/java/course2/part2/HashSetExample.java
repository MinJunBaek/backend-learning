package fc.java.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // 중복된 값이 들어올수 없어서 적용 안됨.

        System.out.println(set.size()); // 3

        for (String element : set) {
            System.out.println(element);
        }

        System.out.println("Banana삭제");
        set.remove("Banana");

        for (String element : set) {
            System.out.println(element);
        }

        boolean contains = set.contains("Cherry");
        System.out.println("Set Contains Cherry? " + contains);

        set.clear(); // set 요소 전부삭제
        boolean empty = set.isEmpty(); // set 요소가 비어있는지 확인
        System.out.println("Set is empty? " + empty);
    }
}
