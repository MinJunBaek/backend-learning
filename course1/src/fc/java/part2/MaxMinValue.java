package fc.java.part2;

import java.util.Scanner;

public class MaxMinValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1. 정수를 입력하세요:");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.print("2. 정수를 입력하세요:");
        int b = scan.nextInt();

        int min = (a < b) ? a : b;
        int max = (a > b) ? a : b;
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
