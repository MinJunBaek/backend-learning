package fc.java.part3;

// import java.lang.*이 생략이 되어 String이나, System을 바로 사용할수 있다.

import java.util.*;
import fc.java.model.*;

public class PackageNameTest {
    public static void main(String[] args) {
        // 문자열 클래스
        String str;
        // 입력(풀네임 버전)
        java.util.Scanner scanFull = new java.util.Scanner(System.in);
        // 입력(import사용 버전)
        Scanner scan = new Scanner(System.in);
        // 출력(풀네임 버전)
        java.lang.System.out.println("Hello World");

        // 우리가 직접 만들어서 사용해 본 클래스들의 이름을 적어보자
        fc.java.model.CarDTO carDTO = new fc.java.model.CarDTO();
        // import를 사용했기때문에 풀네임을 적지 않아도 됨.
        CarDAO carDAO = new CarDAO();
    }
}