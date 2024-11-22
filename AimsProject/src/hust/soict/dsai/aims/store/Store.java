package hust.soict.dsai.aims.store;


import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private static final int MAX_ITEMS = 100; // Maximum number of DVDs in the store
    private DigitalVideoDisc[] itemsInStore;
    private int itemCount;

    public Store() {
        itemsInStore = new DigitalVideoDisc[MAX_ITEMS];
        itemCount = 0;
    }

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (itemCount < MAX_ITEMS) {
            itemsInStore[itemCount++] = dvd; // Add the DVD and increment the count
            System.out.println("Added: " + dvd);
        } else {
            System.out.println("Store is full. Cannot add more DVDs.");
        }
    }

    // Method to remove a DVD from the store by ID
    public void removeDVD(int id) {
        for (int i = 0; i < itemCount; i++) {
            if (itemsInStore[i].getId() == id) {
                System.out.println("Removed: " + itemsInStore[i]);
                // Shift the remaining items to fill the gap
                System.arraycopy(itemsInStore, i + 1, itemsInStore, i, itemCount - i - 1);
                itemsInStore[--itemCount] = null; // Clear the last item
                return;
            }
        }
        System.out.println("No DVD found with ID: " + id);
    }

    // Method to display all DVDs in the store
    public void displayItems() {
        if (itemCount == 0) {
            System.out.println("No DVDs available in the store.");
            return;
        }
        System.out.println("DVDs in Store:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(itemsInStore[i]);
        }
    }
}