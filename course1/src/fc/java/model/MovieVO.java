package fc.java.model;

public class MovieVO {
    private String title;
    private int releaseDate;
    private String character;
    private String genre;
    private float runningTime;
    private int rating;

    public MovieVO(){
    }

    public MovieVO(String title, int releaseDate, String character, String genre, float runningTime, int rating){
        this.title = title;
        this.releaseDate = releaseDate;
        this.character = character;
        this.genre = genre;
        this.runningTime = runningTime;
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(int releaseDate){
        this.releaseDate = releaseDate;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setRunningTime(float runningTime){
        this.runningTime = runningTime;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getCharacter() {
        return character;
    }

    public String getGenre() {
        return genre;
    }

    public float getRunningTime() {
        return runningTime;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return title + "\t" + releaseDate + "\t" + character + "\t" + genre +
                "\t" + runningTime + "\t" + rating;
    }
}
