package fc.java.model2;

public class StringUtils {
    // 인스턴스메서드 (객체를 생성해서 사용해야하는 메서드)
    public String reverse(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}
