package hust.soict.dsai.lab01.Ex61;

import javax.swing.JOptionPane;

public class ChoosingOption {
	
	public static void main (String[] args) { 
		
		int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class tickets ?");
		
		JOptionPane.showMessageDialog(null, "You have chosen " + (option==JOptionPane.YES_OPTION?"Yes" : "No"));
		
		System.exit(0);
		
	}
	
	
	

}