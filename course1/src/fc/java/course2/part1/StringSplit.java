package fc.java.course2.part1;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        String str = "Hello,World,Java";
        String[] strArray = str.split(","); // split으로 자르면 배열형태로 반환해준다.
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        String strSplit = "Hello World   Java";
        // \s+는 하나 이상의 공백을 기준으로 나눈다는 뜻, 하지만 \는 특수기호로 인식하기 때문에 \를 한번더 붙여준다.
        String[] strings = strSplit.split("\\s+"); // 정규표현식사용
        for (String st : strings) {
            System.out.println(st);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요:");
        String strScan = scanner.nextLine();
        String[] strScanArray = strScan.split("\\s+");
        for (String strS : strScanArray) {
            System.out.println(strS);
        }
    }
}