package fc.java.part2;

import java.util.*;

public class IfElseTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = 10;
        // 실행문장이 한줄밖에 없으니 {}를 생략이 가능하나 가독성을 위해 {}를 넣어주는것이 좋다.
        if (x >= 0)
            System.out.println("0 or 양수");
        else
            System.out.println("음수");

        System.out.print("정수를 입력하세요: ");
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

        if (num % 12 == 0) {
            System.out.println("12의 배수입니다.");
        } else {
            System.out.println("12의 배수가 아닙니다.");
        }
    }
}