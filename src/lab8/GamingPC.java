package lab8;

public class GamingPC extends Computer {
    private String videoCard;

    public GamingPC(String processor, int ram, int storage, String videoCard) {
        super(processor, ram, storage);
        this.videoCard = videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getVideoCard() {
        return videoCard;
    }

    @Override
    public void getPerformance() {
        System.out.println("Высокая производительность");
    }

    public void playGame() {
        System.out.println("Играем в игры нв видеокарте " + videoCard);
    }
}
