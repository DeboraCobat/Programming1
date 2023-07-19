//This is the In Class for Java Programming 1 by Debora Correa Batista Bastos ID 6213122
// Purpose: To respond Activity 3-3 
import java.util.Scanner;

public class PerimeterAndArea {
   public static void main(String[] args) {
    
    // 1. declaration class
    Scanner input = new Scanner(System.in);
    float lenght, width, area, perimeter;

    // 2. initialization phase
    System.out.println("Enter lenght of rectangle:");
    lenght = input.nextFloat();
    System.out.println("Enter widht of rectangle:");
    width = input.nextFloat();

    // 3. calculation
    perimeter = 2*(lenght+width);
    area = lenght*width;

     // 4. Display
    System.out.printf("Width of the rectangle is =" + width);
    System.out.println();
    System.out.printf("Height of the rectangle is =" + lenght);
      System.out.println();
    System.out.printf("Perimeter of the rectangle is =" + perimeter);
    System.out.println();
    System.out.printf("Area of the rectangle is=" + area);
    System.out.println();         

  } // end method main
} //end of exercise 3