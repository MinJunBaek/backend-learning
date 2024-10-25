package fc.java.part2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        int num = scan.nextInt();
        System.out.println("num = " + num);

        System.out.print("실수를 입력하세요:");
        float f = scan.nextFloat();
        System.out.println("f = " + f);

        System.out.print("문자열 입력하세요:");
        String str = scan.next(); // 공백을 기준으로 입력이 됨. Hello World -> Hello
        System.out.println("str = " + str);

        // 버퍼비우기
        scan.nextLine(); // World가 입력스트림에 남아서 바로 출력이 됨.

        System.out.print("문자열 입력하세요:");
        String str1 = scan.nextLine();
        System.out.println("str1 = " + str1);

        scan.close();
    }
}