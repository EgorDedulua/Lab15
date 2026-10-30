package lab7;

public class Task1 {
    public static void main(String[] args) throws Exception {
        Game[] games = {
                new Game("Terraria", "Приключения", 8),
                new Game("CS", "Шутер", 5),
                new Game("FNAF", "Хоррор", 9),
                new Game("Valorant", "Шутер", 8),
                new Game("Half-Life 2", "Шутер", 10),
                new Game("Geometry Dash", "Аркада", 7)
        };
        System.out.println("Средний рейтинг всех игр " + Game.getAverageRating());
    }
}
