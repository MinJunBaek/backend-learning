package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.model2.*;

public class GsonToAPI {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        /*
            Json 데이터 형태를 핸들링하기 위한 GsonAPI를 사용
         */
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json); // JSON : {"name":"John","age":30}
    }
}
