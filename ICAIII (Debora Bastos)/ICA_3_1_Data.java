//This is the In Class for Java Programming 1 by Debora Correa Batista Bastos ID 6213122
// Purpose: To respond Activity 3-1 
import java.util.*;

public class ICA_3_1_Data {
    
    // main method begins execution of the Java app
    public static void main(String[] args) {
        final Scanner console = new Scanner(System.in);
        final double PI = 3.14159;

        // 1. declaration phase
        double height;
        double radius;
    
         // 2. initialization phase
                
        System.out.print("Enter the height of the cylinder: ");
        height = console.nextDouble();
        System.out.println();
        System.out.print("Enter the radius of the base of the " + " cylinder: ");
        radius = console.nextDouble();
        System.out.println();
        System.out.println("Volume of the cylinder = " + String.format("%.2f", PI * Math.pow(radius, 2.0) * height));
        System.out.println("Surface area: " + String.format("%.2f", (2 * PI * Math.pow(radius, 2.0)) + (2 * PI * radius * height)));
              
    } // end method main
} //end of exercise


