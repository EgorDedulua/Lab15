package lab11;

public class GamingPC extends  Computer {
    private String videoCard;

    public GamingPC(int storage, int ram, String model, String videoCard) {
        super(storage, ram, model);
        this.videoCard = videoCard;
    }

    @Override
    public String getPerformance() {
        return "Высокая";
    }

    public void play() {
        System.out.println("Играем в игру");
    }

    public void play(String game) {
        System.out.println("Играем в игру " + game);
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }
}
