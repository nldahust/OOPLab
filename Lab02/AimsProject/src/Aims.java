
public class Aims {
	
	public static void main (String[] args) {
		
		Cart anOrder = new Cart();
		

		        // Create some DVD instances with all parameters
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);

		        // Create a DVD instance without director and length
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f); 
		anOrder.addDigitalVideoDisc(dvd3);

		
		System.out.println("Total cost is : ");
		System.out.println(anOrder.totalCost());
		
		  // Display cart contents before removal
        System.out.println("\nCart contents before removal:");
        anOrder.displayCart();

        // Remove a DVD from the cart
        anOrder.removeDigitalVideoDisc(dvd3); // Remove "Aladin"

        // Display cart contents after removal
        System.out.println("\nCart contents after removing 'Aladin':");
        anOrder.displayCart();

        // Attempt to remove a DVD that is not in the cart
        anOrder.removeDigitalVideoDisc(new DigitalVideoDisc("Avatar", "Science Fiction", "James Cameron", 162, 19.99f)); // Non-existing DVD
    }

		
	
		
	}


