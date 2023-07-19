//This is the In Class for Java Programming 1 by Debora Correa Batista Bastos ID 6213122
// Purpose: To respond Activity 3-2 
import java.util.Scanner;

    // main method begins execution of the Java app
public class PersonWeight { 
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

      // 1. declaration phase
      double pound;
      double kilogram;

    // 2. initialization phase
      System.out.println("enter the weight in kilogram:");
      kilogram = input.nextDouble();
      System.out. println();
      pound = 2.20462;
      System.out.println ("weigth in pound=" + String.format("%.2f", kilogram * pound));
      System.out. println ();

    } // end method main
} //end of exercise 2
