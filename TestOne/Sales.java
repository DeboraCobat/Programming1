
/**
 * @author Debora Correa Batista Bastos 6213122
 * @since November 16, 2022
 */

import java.util.Scanner;

public class Sales {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double finalResults, product1, product2, product3, product4, product5, resultProduct1, resultProduct2,
        resultProduct3, resultProduct4, resultProduct5;
    finalResults = 0;
    resultProduct1 = 0;
    resultProduct2 = 0;
    resultProduct3 = 0;
    resultProduct4 = 0;
    resultProduct5 = 0;
    product1 = 2.98;
    product2 = 4.50;
    product3 = 9.98;
    product4 = 4.49;
    product5 = 6.87;

    int choice, quantitySold;

    System.out.print("Choose a product from 1 to 5 or -1 to exit: ");
    choice = input.nextInt();

    for (; choice >= 0;) {

      switch (choice) {
        case 1:
          System.out.print("Enter quantity sold for product 1: ");
          quantitySold = input.nextInt();
          resultProduct1 = (quantitySold * product1);
          finalResults = finalResults + resultProduct1;

          break;
        case 2:
          System.out.print("Enter quantity sold for product 2: ");
          quantitySold = input.nextInt();
          resultProduct2 = (quantitySold * product2);
          finalResults = finalResults + resultProduct2;
          break;
        case 3:
          System.out.print("Enter quantity sold for product 3: ");
          quantitySold = input.nextInt();
          resultProduct3 = (quantitySold * product3);
          finalResults = finalResults + resultProduct3;
          break;
        case 4:
          System.out.print("Enter quantity sold for product 4: ");
          quantitySold = input.nextInt();
          resultProduct4 = (quantitySold * product4);
          finalResults = finalResults + resultProduct4;
          break;
        case 5:
          System.out.print("Enter quantity sold for product 5: ");
          quantitySold = input.nextInt();
          resultProduct5 = (quantitySold * product5);
          finalResults = finalResults + resultProduct5;
          break;

        default:
          System.out.println("please choose valid choice");

          break;
      }

      System.out.print("Choose a product from 1 to 5 or -1 to exit: ");
      choice = input.nextInt();
    }
    System.out.printf("The retail price for product 1 is: $" + "%.2f", resultProduct1);
    System.out.println();
    System.out.printf("The retail price for product 2 is: $" + "%.2f", resultProduct2);
    System.out.println();
    System.out.printf("The retail price for product 3 is: $" + "%.2f", resultProduct3);
    System.out.println();
    System.out.printf("The retail price for product 4 is: $" + "%.2f", resultProduct4);
    System.out.println();
    System.out.printf("The retail price for product 5 is: $" + "%.2f", resultProduct5);
    System.out.println();
    System.out.printf("Your final result is: $" + "%.2f", finalResults);

    input.close();

  }

}