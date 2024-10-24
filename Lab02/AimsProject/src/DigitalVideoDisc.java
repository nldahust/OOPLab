public class DigitalVideoDisc {
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
        this.cost = cost;
    }

    // Constructor with title only
    public DigitalVideoDisc(String title) {
        this.title = title;
        this.category = ""; // Default value
        this.director = ""; // Default value
        this.length = 0;    // Default value
        this.cost = 0.0f;   // Default value
    }

    // Constructor with category, title, and cost
    public DigitalVideoDisc(String category, String title, float cost) {
        this.title = title;
        this.category = category;
        this.director = ""; // Default value
        this.length = 0;    // Default value
        this.cost = cost;
    }

    // Constructor with director, category, title, and cost
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = 0;    // Default value
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

    // Other methods...
}