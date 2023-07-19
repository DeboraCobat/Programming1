//This is a document created in November 15, 2022 to respond Assignment 01 for Java Programming I
// Author: Debora Correa Batista Bastos ID 6213122

// Purpose: Convert inches to centimeters

package Assignment;

import java.util.Scanner;

public class InchesToCentimeters {
  public static final int INCHES_PER_FEET = 12;
  public static final double CENTIMETERS_PER_INCH = 2.54;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // declare variables
    int feet, inches, totalInches;
    double centimeters;

    // initialize variables
    System.out.println("Enter length feet: ");
    feet = input.nextInt();
    System.out.println("Enter length inches: ");
    inches = input.nextInt();

    // calculate variables
    totalInches = feet * INCHES_PER_FEET + inches;
    centimeters = (double) totalInches * CENTIMETERS_PER_INCH;

    // display result
    System.out.println("Total in inches: " + totalInches);
    System.out.println("Total in centimeters: " + centimeters);

    // close scanner object
    input.close();

  }
}

/*
 * step-by-step algorithm
 * 1. Get feet length
 * 2. Store feet length
 * 3. Get inches length
 * 4. Store inches length
 * 5. Multiply feet length for 12
 * 6. Sum result with inches length
 * 7. Multiply the result for 2.54
 * 8. Print out results
 */