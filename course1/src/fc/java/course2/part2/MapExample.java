package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();

        // 데이터 추가
        studentScores.put("Kim", 95);
        studentScores.put("Lee", 85);
        studentScores.put("Park", 90);
        studentScores.put("Choi", 80);

        // 데이터 조회
        System.out.println("Kim's score: " + studentScores.get("Kim"));
        System.out.println("Lee's score: " + studentScores.get("Lee"));

        // 데이터 수정
        studentScores.put("Park", 92);
        System.out.println("Park's score after update: " + studentScores.get("Park"));

        // 데이터 삭제
        studentScores.remove("Choi");
        System.out.println("Choi's score after removal: " + studentScores.get("Choi"));

        // 전체 데이터 출력
        // entrySet()은 해당 hashmap에서 키와 값을 가지고 오는 것.
        // 각각 하나의 키와 값을 엔트리(entry)라고 부른다.
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + "'s score: " + entry.getValue());
        }
    }
}
