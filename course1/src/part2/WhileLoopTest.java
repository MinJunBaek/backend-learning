package fc.java.part2;

public class WhileLoopTest {
    public static void main(String[] args) {
        // 0부터 5까지 출력
        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // while문을 사용하여 배열의 원소 출력
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        i = 0;

        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        // do while문을 사용하여 배열의 원소 출력
        i = 0;
        do {
            System.out.println(numbers[i]);
            i++;
        } while (i < numbers.length);
    }
}