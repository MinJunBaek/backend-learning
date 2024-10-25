package fc.java.part2;

public class ArithmeticOperTest {
    public static void main(String[] args) {
        int digit = 3625;
        System.out.println("1의 자릿수 구하기: " + digit % 10);
        System.out.println("10의 자릿수 구하기: " + digit / 10 % 10);
        System.out.println("100의 자릿수 구하기: " + digit / 100 % 10);
        System.out.println("1000의 자릿수 구하기: " + digit / 1000 % 10);

        // 짝수, 홀수 / 배수
        int su = 5;
        if (su % 2 == 0) {
            System.out.println("짝수 입니다");
        } else {
            System.out.println("홀수 입니다");
        }
    }
}