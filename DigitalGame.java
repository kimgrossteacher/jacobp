public class DigitalGame extends CustomObject {
    private double fileSizeGB;
    private boolean isInstalled;

    public DigitalGame(String title, String platform, int hoursPlayed, double fileSizeGB, boolean isInstalled) {
        super(title, platform, hoursPlayed); // Inherit constructor from CustomObject
        this.fileSizeGB = fileSizeGB;
        this.isInstalled = isInstalled;
    }

    public void toggleInstall() {
        this.isInstalled = !this.isInstalled;
        System.out.println(getTitle() + " installation status changed. Installed: " + isInstalled);
    }

    @Override
    public void displayInfo() {
        System.out.println("Digital Game: " + getTitle() + " | Platform: " + getPlatform() + 
                           " | Hours: " + getHoursPlayed() + " | Size: " + fileSizeGB + 
                           "GB | Installed: " + isInstalled);
    }
}