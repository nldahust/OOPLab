import java.text.DecimalFormat;
public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20; // Maximum number of items in the cart
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered; // Tracks the current quantity of discs in the cart

    // Constructor to initialize the cart
    public Cart() {
        qtyOrdered = 0;
    }

    // Method to add a DigitalVideoDisc to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
        } else {
            System.out.println("The cart is almost full. Cannot add more discs.");
        }
    }

    // Method to remove a DigitalVideoDisc from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(disc.getTitle())) {
                // Shift items to fill the gap
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null; // Clear the last item
                qtyOrdered--;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
                return;
            }
        }
        System.out.println("The disc \"" + disc.getTitle() + "\" is not found in the cart.");
    }

    // Method to calculate the total cost of the cart
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    // Method to display the contents of the cart
    public void displayCart() {
        System.out.println("Current items in the cart:");
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc disc = itemsOrdered[i];
            System.out.println("- " + disc.getTitle() + " | Cost: " + disc.getCost());
        }
        
        // Create a DecimalFormat instance
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Total cost: " + df.format(totalCost()));
    
    }
}