import java.util.Scanner;
//The main class of the Crystal Compass Application
//The program communicates with the CrystalLibrary class to find matching crystals.
public class CrystalCompass {
    public static void main(String[] args) {
        //Scanner object to read information entered by the user
        Scanner scanner = new Scanner(System.in);
        //Creates an object containing the predfined crystals.
        CrystalLibrary library = new CrystalLibrary();
        //Welcome message
        System.out.println("Welcome to Crystal Compass!");
        //Initializes the tryAgain variable to yes which allows the recommendation process to begin.
        String tryAgain = "Yes";
        //While loop repeats recommendation process if user enters "yes".
        while ( tryAgain.equalsIgnoreCase("yes")) {
        System.out.println("Enter your preferred color: ");
        //Scanner reads input and stores it in the String variable named color
        String color = scanner.nextLine();

        System.out.println("Enter your desired intention: ");
        //Input for the intention is stored in the string variable intention.
        String intention = scanner.nextLine();
        //Calls the findMatches() method from the CrystalLibrary.
        //Passes user's color and intention as arguments
        library.findMatches(color, intention);
        //Asks user if they would like to search again. 
        System.out.print("Would you like to try again? (yes/no): ");
        tryAgain = scanner.nextLine();
    }
    System.out.println("Thank you for using Crystal Compass!");
    //Closes the scanner as the program no longer needs to read keyboard input. 
    scanner.close();
} //Ends the main method
} //Ends the CrystalCompass class. 
