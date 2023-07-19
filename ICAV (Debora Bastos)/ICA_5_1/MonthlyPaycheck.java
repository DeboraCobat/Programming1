package ICA_5_1;
/*This is a program write by Debora Correa Batista Bastos ID 6213122 with 
purpose: Answer ICA 5-1
November 14, 2022 */

// import java package
import java.util.*;
import java.io.*;

public class MonthlyPaycheck {
  public static void main(String[] args) throws FileNotFoundException {

   // 1. declaration phase
    String firstName, lastName;
    float federalTax, pensionPlan,grossAmount, stateTax, socialSecurityTax, medicareMedicaidTax, healthInsurance, netPay, STATE_TAX_RATE, FEDERAL_TAX_RATE,PENSION_PLAN_RATE, SOCIAL_SECURITY_TAX_RATE, MEDICARE_MEDICATE_TAX_RATE;
    Scanner inFile;
    PrintWriter outFile;

    // 2. Processing phase

    inFile = new Scanner(new FileReader ("ICA_5_1/DeductionsEmployee.txt"));
    outFile = new PrintWriter ("ICA_5_1/MonthlyPaycheck.txt");

    firstName = inFile.nextLine();
    lastName =  inFile.nextLine();
    grossAmount = inFile.nextFloat();
;

    //deductions rate calculation
    FEDERAL_TAX_RATE = inFile.nextFloat()/100;
    STATE_TAX_RATE = inFile.nextFloat()/100;
    SOCIAL_SECURITY_TAX_RATE = inFile.nextFloat()/100;
    MEDICARE_MEDICATE_TAX_RATE = inFile.nextFloat()/100;
    PENSION_PLAN_RATE = inFile.nextFloat()/100;
    healthInsurance = inFile.nextFloat();

    // calculate deductions
      federalTax = (grossAmount * FEDERAL_TAX_RATE);
      stateTax = (grossAmount * STATE_TAX_RATE);
      socialSecurityTax = (grossAmount * SOCIAL_SECURITY_TAX_RATE);
      medicareMedicaidTax = (grossAmount * MEDICARE_MEDICATE_TAX_RATE);
      pensionPlan = (grossAmount * PENSION_PLAN_RATE);

    // calculate netPay
      netPay = (grossAmount - federalTax - stateTax - socialSecurityTax - medicareMedicaidTax - pensionPlan - healthInsurance);

    // 3. Out printing phase
    outFile.println(firstName + " " + lastName);
    outFile.printf("Gross Amount: $" + "%.2f", grossAmount);
    outFile.println();
    outFile.println("Federal Tax: $" + federalTax);
    outFile.printf("State Tax: $" + "%.2f", stateTax);
    outFile.println();
    outFile.printf("Social Security Tax: $" + "%.2f", socialSecurityTax);
    outFile.println();
    outFile.printf("Medicare/Medicaid Tax: $" + "%.2f", medicareMedicaidTax);
    outFile.println();
    outFile.println("Pension Plan: $" + pensionPlan);
    outFile.printf("Health Care: $" + "%.2f", healthInsurance);
    outFile.println();
    outFile.printf("Net Pay: $" + "%.2f", netPay);
   
    //3. Closure
    inFile.close ();
    outFile.close();
  } // end method main
} // end of the exercise
