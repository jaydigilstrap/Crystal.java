import java.util.ArrayList;
//This class stores the crystals and searches for recommendations based on user's preference.
public class CrystalLibrary {
    //Creates ArrayList for Crystals 
    private ArrayList<Crystal> crystals = new ArrayList<>();
    //Crystal Objects that will be stored in the ArrayList 
    //Individual crystal objects using the constructor defined in Crystal.java
    Crystal aquamarine = new Crystal(
        "Aquamarine",
        "Blue",
        "Calmness", 
        "Traditionally associated with tranquility and emotional balance." 
    );
    Crystal citrine = new Crystal(
        "Citrine",
        "Yellow",
        "Confidence",
        "Traditionally associated with confidence, positivity, and abundance."
    );
    Crystal amethyst = new Crystal(
        "Ameythyst",
        "Purple",
        "Clarity",
        "Traditionally associated with clarity, calmness, and inner peace."
    );
    Crystal roseQuartz = new Crystal(
        "Rose Quartz",
        "Pink",
        "Love",
        "Traditionally associated with love, compassion, and empotional healing"
    );

        public CrystalLibrary() { 
        //CrystalLibrary constructor adds crystal objects to the ArrayList 
        //The program will search all stored crystals using loops 
        crystals.add(aquamarine);
        crystals.add(citrine);
        crystals.add(amethyst);
        crystals.add(roseQuartz);
        }
    public void printCrystals() {
        //Displays all crystals stored in ArrayList
        //Enhanced for loop will examine each Crystal object at a time
        //Getter methods retrieve the name, color, intention and description of the object
        for (Crystal crystal : crystals) {
            System.out.println("Name: " + crystal.getName());
            System.out.println("Color: " + crystal.getColor());
            System.out.println("Intention: " + crystal.getIntention());
            System.out.println("Description: " + crystal.getDescription());
            System.out.println();
        }
    }
    //Searches the crystal collection using the user's preferences
    //The color and intention parameters receive information.
    //Exact matches are displayed first. 
        public void findMatches(String color, String intention) {
            //Tracks whether at least one crystal matches both preferences
            //false means no exact match has been found.
            boolean matchFound = false;
        //This loop examines every crystal
        for (Crystal crystal : crystals) {
            //Checks whether both the color and intention match the user's preference. 
            //.equalsIgnoreCase() compares text without considering uppercase or lowercase letters.
            if (crystal.getColor().equalsIgnoreCase(color)
                && crystal.getIntention().equalsIgnoreCase(intention)) {
            System.out.println("Matching Crystal: " + crystal.getName()); 
            System.out.println("Description: " + crystal.getDescription());
                    //Records that a match has been found. 
                    matchFound = true;
                } //closes if statement
        } //closes first loop 
        //If no match has been found, the program searches for alternatives.
            if(!matchFound) {
                System.out.println("No exact match found. Checking alternatives...");
                //Tracks whether a crystal matches at least one preference.
                boolean partialMatchFound = false;
                //Second loop: searches the collection for partial matches.
                for(Crystal crystal : crystals) {
                    //Checks if only the color matches to a crystal.
                    if(crystal.getColor().equalsIgnoreCase(color)
                    && !crystal.getIntention().equalsIgnoreCase(intention)){
                //Recommends the crystal based on color.
                System.out.println("Matches your preferred color: " + crystal.getName());
                System.out.println("Description: " + crystal.getDescription());
                partialMatchFound = true;

                }
                //Checks if only the intention has a match.
                else if (!crystal.getColor().equalsIgnoreCase(color)
                    && crystal.getIntention().equalsIgnoreCase(intention)) {
                //Recommends the crystal based on intention
                System.out.println("Matches your desired intention: " + crystal.getName());
                System.out.println("Description: " + crystal.getDescription());
                //Records that a partial match was found. 
                partialMatchFound = true;
                }
            }
            //If no matches to the color or to the intention are found
            if (!partialMatchFound) {
                System.out.println("No matching crystals found."); 
            }
        }
        }
    }
            