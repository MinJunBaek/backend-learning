package fc.java.course2.part1;
// CC를 이용하여 BB를 동작시키는 프로그래밍(인터페이스 기반의 프로그래밍)
import fc.java.model2.*;

public class InterfaceAPI {
    public static void main(String[] args) {
        CC cc = new BB();
        cc.x();
        cc.y();
        cc.z();
    }
}
