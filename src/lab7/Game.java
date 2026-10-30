package lab7;

public class Game {
    private String name;
    private String genre;
    private int rating;
    private static int totalGames;
    private static int totalRating;

    static {
        totalGames = 0;
        totalRating = 0;
    }

    public static void print() {
        System.out.println(totalGames);
    }

    public Game(String name, String genre, int rating) throws Exception {
        this.name = name;
        this.genre = genre;
        setRating(rating);
        ++totalGames;
        totalRating += rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(int rating) throws Exception {
        if (rating < 1 || rating > 10)
            throw new Exception("Рейтинг должен быть от 1 до 10");
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    public static int getAverageRating() throws Exception {
        if (totalGames == 0)
            throw new Exception("Нету игр");
        return totalRating / totalGames;
    }
}
