// Written By Jacob P
//for Mr Gross SD1
// This program demonstrates the use of inheritance in Java by creating a base class CustomObject and two derived classes DigitalGame and PhysicalGame. Each class has its own attributes and methods, and the main method creates instances of each class, displays their information, simulates playing the games, and then displays the updated information.


public class main {
    public static void main(String[] args) {
        // Create objects of all three types
        CustomObject baseGame = new CustomObject("Minecraft", "PC", 50);
        DigitalGame digiGame = new DigitalGame("Zelda: Breath of the Wild", "Nintendo Switch", 85, 70.5, true);
        PhysicalGame physGame = new PhysicalGame("Super Mario 64", "Nintendo 64", 30, false, "Good");

        System.out.println("--- Initial Game Status ---");
        baseGame.displayInfo();
        digiGame.displayInfo();
        physGame.displayInfo();

        System.out.println("\n--- Playing Games ---");
        baseGame.playGame(10);
        digiGame.playGame(15);
        digiGame.toggleInstall();
        physGame.playGame(5);

        System.out.println("\n--- Updated Game Status ---");
        baseGame.displayInfo();
        digiGame.displayInfo();
        physGame.displayInfo();
    }
}
