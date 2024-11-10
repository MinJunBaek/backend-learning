package fc.java.course2.part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 특정 개체의 인스턴스 메서드 참조
public class SortCompareTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "김길동", "이길동");
        Collections.sort(names, String::compareTo);
        // String에 compareTo메서드를 참조해서 정렬
        System.out.println(names); // [김길동, 이길동, 홍길동]
        for (String name : names) {
            System.out.println(name);
        }
    }
}
