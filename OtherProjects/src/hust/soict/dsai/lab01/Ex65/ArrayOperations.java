package hust.soict.dsai.lab01.Ex65;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        // Initialize the array
        double[] array = new double[size];

        // Get array elements from user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        // Sort the array
        Arrays.sort(array);

        // Calculate sum and average
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / size;

        // Display results
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Average: %.2f%n", average);

        // Close the scanner
        scanner.close();
    }
}