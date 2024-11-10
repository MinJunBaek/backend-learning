package fc.java.course2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 6, 7, 1, 2, 3, 8, 4, 10, 9);
        Predicate<Integer> isEven = n -> n % 2 == 0;
        int sumOfSquares = numbers.stream()
                // .filter(isEven)
                // .filter(n -> n % 2 == 0) 이렇게 나타내도 상관이 없다.
                .filter(StreamExample::isEven)
                .sorted()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("짝수의 제곱의 합: " + sumOfSquares);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}