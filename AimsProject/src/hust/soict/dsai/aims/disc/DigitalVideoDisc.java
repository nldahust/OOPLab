package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0; // Class attribute to keep track of the number of DVDs
    private int id; // Instance attribute for unique ID
    private String title;
    private String category; // Optional
    private String director; // Optional
    private int length;      // Optional
    private float cost;

    // Constructor with all parameters
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        setCost(cost);  // Use setter for validation
        this.id = ++nbDigitalVideoDiscs; // Increment and assign ID
    }

    // Constructor with title only
    public DigitalVideoDisc(String title) {
        this(title, "", "", 0, 0.0f); // Call the full constructor
    }

    // Constructor with category, title, and cost
    public DigitalVideoDisc(String category, String title, float cost) {
        this(title, category, "", 0, cost); // Call the full constructor
    }

    // Constructor with director, category, title, and cost
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this(title, category, director, 0, cost); // Call the full constructor
    }

    // Setters with validation
    public void setCost(float cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative.");
        }
        this.cost = cost;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id; // Getter for the unique ID
    }
    
    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }


    // Override toString for easy display
    @Override
    public String toString() {
        return String.format("ID: %d, Title: %s, Category: %s, Director: %s, Length: %d min, Cost: %.2f",
                id, title, category, director, length, cost);
    }

    // Other methods...
}