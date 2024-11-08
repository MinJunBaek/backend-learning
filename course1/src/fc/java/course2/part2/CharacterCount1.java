package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount1 {
    public static void main(String[] args) {
        // 입력값을 받는다.
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char ch = scan.nextLine().charAt(0);

        // 입력값으로 갯수를 세는 메서드
        System.out.println(getCharCount(str, ch));

    }

    public static int getCharCount(String str, char ch) {
        char[] chArray = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();

        for (char c : chArray) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        return charMap.get(ch);
    }
}
