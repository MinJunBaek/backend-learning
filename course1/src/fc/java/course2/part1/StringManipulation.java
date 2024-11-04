package fc.java.course2.part1;

public class StringManipulation {
    public static void main(String[] args) {
        // HelloWorld라는 문자열을 생성하세요.
        int a = 10; // a는 기본자료형으로 값을 10을 가지고 있다.
        String str = "HelloWorld"; // String은 객체로 취급하기 때문에 str은 주소값을 가르킨다.
        System.out.println(str.charAt(1)); // e

        // (혼자만의 생각) 그렇다면 반복문으로 출력할수 있는가?
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println(str.replace("o", "X")); // 홀따옴표가 아닌 쌍따옴표로 감싸야 한다.
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(5)); // World
        System.out.println(str.substring(5, 8)); // Wor
        System.out.println(str.indexOf("W")); // 5
        System.out.println(str.indexOf("Wor")); // 5
        System.out.println(str.indexOf("Wr")); // 못찾으면 -1
    }
}