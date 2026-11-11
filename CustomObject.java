public class CustomObject {

    private String title;
    private String platform;
    private int hoursPlayed;

    public CustomObject(String title, String platform, int hoursPlayed) {
        this.title = title;
        this.platform = platform;
        this.hoursPlayed = hoursPlayed;
    }

    public void playGame(int hoursToAdd) {
        if (hoursToAdd > 0) {
            this.hoursPlayed += hoursToAdd;
            System.out.println(title + " was played for " + hoursToAdd + " hours.");
        }
    }

    public void displayInfo() {
        System.out.println("Game: " + title + " | Platform: " + platform + " | Total Hours Played: " + hoursPlayed);
    }

    public String getTitle() {
        return title;
    }

    public String getPlatform() {
        return platform;
    }

    public int getHoursPlayed() {
        return hoursPlayed;
    }
}
