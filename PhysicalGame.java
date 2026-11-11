public class PhysicalGame extends CustomObject {
    private boolean hasOriginalCase;
    private String conditionRating;

    public PhysicalGame(String title, String platform, int hoursPlayed, boolean hasOriginalCase, String conditionRating) {
        super(title, platform, hoursPlayed);
        this.hasOriginalCase = hasOriginalCase;
        this.conditionRating = conditionRating;
    }

    public void updateCondition(String newCondition) {
        this.conditionRating = newCondition;
        System.out.println(getTitle() + " condition updated to: " + conditionRating);
    }

    @Override
    public void displayInfo() {
        System.out.println("Physical Game: " + getTitle() + " | Platform: " + getPlatform() + 
                           " | Hours: " + getHoursPlayed() + " | Original Case: " + hasOriginalCase + 
                           " | Condition: " + conditionRating);
    }
}