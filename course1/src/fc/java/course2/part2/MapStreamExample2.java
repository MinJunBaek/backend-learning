package fc.java.course2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "orange");

        // 스트림의 각 원소를 대문자로 변환한 새로운 리스트 생성
        List<String> uppercasedWords = words.stream()
                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("uppercasedWords = " + uppercasedWords);

        for (String str : uppercasedWords) {
            System.out.println(str);
        }
    }
}