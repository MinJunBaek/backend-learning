package fc.java.poly;
import java.lang.*;

public class Board extends Object{
    // 상속으로 toString()을 사용할수 있음.
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        // 부모의 toString을 호출
        System.out.println(super.toString());
        // toString()을 재정의하여 많이 사용한다.
        return "Board{" +
                "title='" + title + '\'' +
                '}';
    }
}
