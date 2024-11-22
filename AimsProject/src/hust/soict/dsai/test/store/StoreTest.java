package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        
        // Create some DVD instances
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle Book", "Animation", "Director A", 90, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella", "Fantasy", "Director B", 75, 14.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King", "Animation", "Director C", 85, 24.99f);
        
        // Test adding DVDs to the store
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        
        // Display items in store
        store.displayItems();
        
        // Test removing a DVD
        store.removeDVD(dvd2.getId()); // Remove Cinderella
        store.displayItems(); // Display remaining DVDs
        
        // Try to remove a DVD that doesn't exist
        store.removeDVD(999); // Nonexistent ID
    }
}