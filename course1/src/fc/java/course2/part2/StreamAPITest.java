package fc.java.course2.part2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPITest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        // Stream 사용하기 전
        int even = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                even += number;
            }
        }
        System.out.println("even = " + even);
        // stream을 사용하여 배열을 스트림 형태로 변환
        IntStream stream = Arrays.stream(numbers);

        int sumOfEvens = Arrays.stream(numbers)
                        .filter(n -> n % 2 == 0)//(n -> n % 2 == 0) 람다식
                        .sum();
        System.out.println("sumOfEvens = " + sumOfEvens);

        // 스트림은 중간연산과 최종연산이 있다
        int[] evenNumbers = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0) // 중간연산(스트림을 처리후 다른스트림 반환)
                .toArray(); // 최종연산(결과반환)

        for (int number : evenNumbers) {
            System.out.println(number);
        }
    }
}
