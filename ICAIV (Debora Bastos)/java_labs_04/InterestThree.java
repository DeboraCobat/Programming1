package java_labs_04;

/*
Purpose:
Consider the following problem statement:
A person invests $1000.00 in a savings account 
yielding 5 percent interest. Assuming that all 
interest is left on deposit in the account, 
calculate and print the amount of money in the 
account at the end of each year for 10 years. 
Use the following formula for determining 
these amounts:

	a(fv) = p (1 + r)^n

Where
	p is the original amount invested (i.e., the principal)
	r is the annual rate,
	n is the number of years, and
	a is the amount on deposit at the end of the nth year 
*/
public class InterestThree {
    // main method begins execution of Java App
    public static void main(String[] args) {
        // 1. declaration phase
        double amount; // amount on deposit at the end of each year
        double principal; // initial amount before interest
        final double ANNUAL_RATE = 0.05; // interest annual rate
        int years; // period of investment
        int yearCounter;
        double amountPerYear;
        String formattedAmountPerYear;

        // 2. Initialization Phase
        principal = 1000.00;
        years = 10;
        yearCounter = 1;
        amountPerYear = principal;

        // 3. Processing Phase
        // a = p (1 + r) ^ n
        /*
         * pow(double a, double b)
         * Returns the value of the first argument raised to the power of the second argument.
         */
        amount = principal * Math.pow( (1 + ANNUAL_RATE), years);
        System.out.println(
            "The interset for $"
            + principal
            + " invested for " 
            + years + " years at "
            + ANNUAL_RATE 
            + " is "
            + amount
        );

        //5. Display (Exercise ICA_4_1)
        System.out.println("Amount to invest:" + amount);
        System.out.println("Annual rate:" + ANNUAL_RATE);
        System.out.println("Number of year of investment:" + years);

        //6. Calculation (Exercise ICA_4_2)
        System.out.printf("Year   Amount on deposit");
        System.out.println();
        System.out.printf("====   =================");
        System.out.println();
        while (yearCounter <= years) {
          amountPerYear = principal * Math.pow( (1 + ANNUAL_RATE), yearCounter);
          formattedAmountPerYear = String.format("%.2f", amountPerYear);

          System.out.printf("   " + yearCounter + "           " + formattedAmountPerYear);
          System.out.println();
          yearCounter++;
        } 
    } // end method main 
} // end class InterestThree
  
