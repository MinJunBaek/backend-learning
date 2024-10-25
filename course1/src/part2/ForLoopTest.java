package fc.java.part2;

public class ForLoopTest {
    public static void main(String[] args) {
        // 반목문으로 1부터 10까지 출력
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 대문자 A부터 Z까지 아스키코드값 출력
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c + ":" + ((int) c));
        }

        // 소문자 a부터 z까지 아스키코드값 출력
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c + ":" + ((int) c));
        }

        // 배열에 있는 원소 출력
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int num : numbers){
            System.out.println(num);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
