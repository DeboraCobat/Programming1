package ICA_5_1;
/*This is a program write by Debora Correa Batista Bastos ID 6213122 with 
purpose: Answer ICA 5-1
November 14, 2022 */

// import java package
import java.io.*;
import java.util.*;

public class EmployeesUpdatedSalary {
  public static void main(String[] args) throws FileNotFoundException {

   // 1. declaration phase
    String firstName, lastName;
    double currentSalary, updatedSalary, percentage;
    float payIncreasePercent;
    Scanner inFile;
    PrintWriter outFile;

    inFile = new Scanner(new FileReader ("ICA_5_1/EmployeesSalary.txt"));
    outFile = new PrintWriter ("ICA_5_1/EmployeesUpdatedSalary.txt");

    while (inFile.hasNextLine()) {
      firstName = inFile.next();
      lastName = inFile.next();
      currentSalary = inFile.nextDouble();
      payIncreasePercent = inFile.nextFloat();

      //calculate percentage
      percentage = currentSalary/(payIncreasePercent*100);

    //calculate the new salary
      updatedSalary = currentSalary + percentage;
    
      //2. Processing phase

      outFile.println (" " + firstName + " " + lastName);
      outFile.printf ("%.2f", updatedSalary);
      outFile.println ();
    
    }

    inFile.close();
    outFile.close();
  } // end method main
} // end of the exercise
