package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.model3.Member;

public class GsontoJson {
    public static void main(String[] args) {
        Member mvo = new Member("홍길동", 30, "bit@emaps.com");
        // JSON형식으로 일일히 변경하면 무척 힘들다 이때 Gson이라는 API를 사용하면 편리하다
        // 객체 생성
        Gson gson = new Gson();

        // Object(Member) -> JSON
        String json = gson.toJson(mvo);
        System.out.println("json = " + json);
    }
}
