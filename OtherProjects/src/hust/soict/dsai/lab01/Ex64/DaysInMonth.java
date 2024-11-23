package hust.soict.dsai.lab01.Ex64;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DaysInMonth {
    private static final Map<String, Integer> MONTHS = new HashMap<>();
    
    static {
        MONTHS.put("January", 1); MONTHS.put("Jan", 1); MONTHS.put("1", 1);
        MONTHS.put("February", 2); MONTHS.put("Feb", 2); MONTHS.put("2", 2);
        MONTHS.put("March", 3); MONTHS.put("Mar", 3); MONTHS.put("3", 3);
        MONTHS.put("April", 4); MONTHS.put("Apr", 4); MONTHS.put("4", 4);
        MONTHS.put("May", 5); MONTHS.put("5", 5);
        MONTHS.put("June", 6); MONTHS.put("Jun", 6); MONTHS.put("6", 6);
        MONTHS.put("July", 7); MONTHS.put("Jul", 7); MONTHS.put("7", 7);
        MONTHS.put("August", 8); MONTHS.put("Aug", 8); MONTHS.put("8", 8);
        MONTHS.put("September", 9); MONTHS.put("Sep", 9); MONTHS.put("9", 9);
        MONTHS.put("October", 10); MONTHS.put("Oct", 10); MONTHS.put("10", 10);
        MONTHS.put("November", 11); MONTHS.put("Nov", 11); MONTHS.put("11", 11);
        MONTHS.put("December", 12); MONTHS.put("Dec", 12); MONTHS.put("12", 12);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year;

        while (true) {
            System.out.print("Enter the month (name, abbreviation, or number): ");
            monthInput = scanner.nextLine().trim();
            if (MONTHS.containsKey(monthInput)) break;
            System.out.println("Invalid month. Please try again.");
        }

        while (true) {
            System.out.print("Enter the year (exactly 4 digits): ");
            String yearInput = scanner.nextLine().trim();
            if (yearInput.matches("\\d{4}") && Integer.parseInt(yearInput) >= 0) {
                year = Integer.parseInt(yearInput);
                break;
            }
            System.out.println("Invalid year. Please enter a valid non-negative four-digit integer.");
        }

        int month = MONTHS.get(monthInput);
        int days = getDaysInMonth(month, year);
        System.out.println("The number of days in " + monthInput + " " + year + " is: " + days);
        
        scanner.close();
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31; // Months with 31 days
            case 4: case 6: case 9: case 11:
                return 30; // Months with 30 days
            case 2:
                return isLeapYear(year) ? 29 : 28; // February
            default:
                return 0; // This should never happen
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}