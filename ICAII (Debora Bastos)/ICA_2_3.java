//this program was written by Debora Correa Batista Bastos ID 6213122 to Java Programming I
//Purpose: Respond to ICA 2-3

public class ICA_2_3 {

	static int SECRET_NUM = 11213;
	static final double PAY_RATE = 18.35;
	  
  public static void main(String[] arg) {

    // declare variables

    int one, two;
    double first, second, three, paycheck, hoursWorked;
    
    // initialize variables
    one = 18;
    two = 11;
    
    first = 25;
    three = 1;
    hoursWorked = 37.5;
    second = first * three;
    second = 2 * SECRET_NUM;
    SECRET_NUM = SECRET_NUM + 3;
    
    // System.out.println("Enter value");
    System.out.println(first + " " + second + " " + SECRET_NUM);
    
    paycheck = hoursWorked * PAY_RATE;
    // display Wages
    System.out.println("Wages = " + paycheck);
  } // end method main
} // end class ICA_2_3