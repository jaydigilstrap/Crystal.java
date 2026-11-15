//This class represents an individual crystal in the crystal compass.
//Each crystal contains a name, color, intention, and description.

public class Crystal {
    //The private variables store information for each crystal.
    //Private prevents other classes from changes these values
    private String name;
    private String color;
    private String intention;
    private String description;

    //This constructor creates a crystal object using the four pieces of information.
    
    public Crystal(String name, String color, String intention, String description) {
        this.name = name;
        this.color = color;
        this.intention = intention;
        this.description = description;
    } 
    //Getter methods that allow other parts of the program to retrieve a crystal's stored information.
    public String getName() {           //Returns the name of the crystal
        return name;
    }       
    public String getColor() {          //Returns the color of the crystal
        return color;
    }
    public String getIntention() {      //Returns the intention of the crystal
        return intention;
    }
    public String getDescription() {     //Returns the description of the crystal
        return description;
    }

    }
