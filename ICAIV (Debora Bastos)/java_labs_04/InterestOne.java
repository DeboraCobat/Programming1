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
public class InterestOne {
    // main method begins execution of Java App
    public static void main(String[] args) {
        // 1. declaration phase
        double amount; // amount on deposit at the end of each year
        double principal; // initial amount before interest
        final double ANNUAL_RATE = 0.05; // interest annual rate
        int year; // period of investment

        // 2. Initialization Phase
        principal = 1000.00;
        year = 10;

        // 3. Processing Phase
        // a = p (1 + r) ^ n
        /*
         * pow(double a, double b)
         * Returns the value of the first argument raised to the power of the second argument.
         */
        amount = principal * Math.pow( (1 + ANNUAL_RATE), year);
        System.out.println(
            "The interset for $"
            + principal
            + " invested for " 
            + year + " years at "
            + ANNUAL_RATE 
            + " is "
            + amount
        );

    } // end method main
} // end class InterestOne