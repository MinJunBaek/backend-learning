package fc.java.part2;

import java.util.Scanner;

public class IfbasicTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = -10;
        if (x > 0) {
            System.out.println("양수입니다.");
        }

        System.out.print("숫자를 입력하세요: ");
        int num = scan.nextInt();

        // 실행 문장이 한 문장일 경우 생략이 가능하다.
        if (num % 7 == 0)
            System.out.println("7의 배수입니다.");

        System.out.print("나이를 입력하세요: ");
        int age = scan.nextInt();

        if (age >= 19) {
            System.out.println("성인입니다.");
        }

        System.out.println("종료");
    }
}