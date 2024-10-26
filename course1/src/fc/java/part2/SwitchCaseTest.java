package fc.java.part2;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();
        switch (str) {
            case "sunday" -> {
                System.out.println("야구하기");
                break;
            }
            case "monday" -> {
                System.out.println("농구하기");
                break;
            }
            case "tuesday", "wednesday" -> {
                System.out.println("수영하기");
                break;
            }
            case "friday" -> {
                System.out.println("수영하기");
                break;
            }
            case "saturday" -> {
                System.out.println("수영하기");
                break;
            }
            default -> {
                System.out.println("잘못입력하였습니다.");
            }
        }
    }
}