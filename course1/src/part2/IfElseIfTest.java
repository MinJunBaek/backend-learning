package fc.java.part2;

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score;
        while (true) {
            System.out.print("점수를 입력하세요: ");
            score = scan.nextInt();
            if (score >= 0 && score <= 100) {
                break;
            }
            System.out.println("유효한 점수가 아닙니다.");
        }

        if (score < 80) {
            System.out.println("불합격");
        } else if (score >= 90) {
            System.out.println("A반");
        } else if (score >= 85) {
            System.out.println("B반");
        } else {
            System.out.println("C반");
        }
    }
}