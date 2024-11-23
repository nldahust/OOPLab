package hust.soict.dsai.lab01.Ex63;
import java.util.Scanner;

public class TriangleOfStars {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Request height of the triangle from the user
        System.out.print("Please enter the height of the triangle: ");
        int height = input.nextInt();

        // Iterate through each level of the triangle
        for (int row = 0; row < height; row++) {
            // Print spaces for alignment
            for (int space = 0; space < height - row - 1; space++) {
                System.out.print(" ");
            }
            // Print stars for the current row
            for (int star = 0; star < 2 * row + 1; star++) {
                System.out.print("*");
            }
            // Move to the next line after finishing the current row
            System.out.println();
        }

        // Close the scanner
        input.close();
    }
}


