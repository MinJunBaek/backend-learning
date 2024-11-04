package fc.java.course2.part1;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        if (str1.equals(str2)) {
            System.out.println("str1==str2");
        } else {
            System.out.println("str1!=str2");
        }

        String str3 = "apple";
        String str4 = "banana";

        int result = str3.compareTo(str4); // 대소문자 구분하여 비교(0, 음수, 양수)값으로 나옴

        if (result == 0) {
            System.out.println("str3==str4");
        } else if (result < 0) {
            System.out.println("str3<str4"); // 음수는 str3가 더 작고 사전순으로 앞선다는 뜻이다.
        } else {
            System.out.println("str3>str4"); // 양수는 str3가 더 크고 사전순으로 뒤에있다는 뜻이다.
        }
    }
}