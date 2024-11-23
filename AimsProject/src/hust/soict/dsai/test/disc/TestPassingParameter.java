package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

    public static void main(String[] args) {
        // Create two DVD instances
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        
        // Print original titles
        System.out.println("Before swap:");
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
        
        // Create an array to hold the DVDs to swap
        DigitalVideoDisc[] dvdsToSwap = {jungleDVD, cinderellaDVD};
        swap(dvdsToSwap);
        
        // Print titles after swap
        System.out.println("After swap:");
        System.out.println("jungle dvd title: " + dvdsToSwap[0].getTitle());
        System.out.println("cinderella dvd title: " + dvdsToSwap[1].getTitle());
      
    }
    
    // Swap method using an array
    public static void swap(DigitalVideoDisc[] dvds) {
        if (dvds.length == 2) {
            DigitalVideoDisc tmp = dvds[0];
            dvds[0] = dvds[1];
            dvds[1] = tmp;
        }
    }
    
    }