package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        
        // Create some DVD instances
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle Book", "Animation", "Director A", 90, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella", "Fantasy", "Director B", 75, 14.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King", "Animation", "Director C", 85, 24.99f);
        
        // Test adding DVDs to the store
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        
        // Display items in store
        store.print();
        
        // Test removing a DVD
        store.removeMedia(dvd2); // Remove Cinderella
        store.print(); // Display remaining DVDs
        

    }
}