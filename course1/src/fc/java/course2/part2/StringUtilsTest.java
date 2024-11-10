package fc.java.course2.part2;

import fc.java.model2.Converter;
import fc.java.model2.StringUtils;

public class StringUtilsTest {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        Converter<String, String> converter = stringUtils::reverse;
        // Converter가 StringUtils의 reverse메서드를 참조
        String result = converter.convert("hello");
        System.out.println("result = " + result);
    }
}
