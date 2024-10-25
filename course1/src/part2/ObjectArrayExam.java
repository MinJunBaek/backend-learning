package fc.java.part2;

public class ObjectArrayExam {
    public static void main(String[] args) {
        Movie[] m = {new Movie(), new Movie(), new Movie()};
        m[0].title = "안녕, 할부지";
        m[0].releaseDate = "2024.09.04";
        m[0].character = "푸바오";
        m[0].genre = "다큐멘터리";
        m[0].runningTime = 95;
        m[0].rating = "전체 관람가";

        m[1].title = "파일럿";
        m[1].releaseDate = "2024.07.31";
        m[1].character = "조정석";
        m[1].genre = "코미디";
        m[1].runningTime = 111;
        m[1].rating = "12세 이상 관람가";

        m[2].title = "빅토리";
        m[2].releaseDate = "2024.08.14";
        m[2].character = "혜리";
        m[2].genre = "드라마";
        m[2].runningTime = 120;
        m[2].rating = "12세 이상 관람가";

        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].title + "\t" + m[i].releaseDate + "\t" + m[i].character + "\t"
            + m[i].genre + "\t" + m[i].runningTime + "\t" + m[i].rating);
        }
    }
}