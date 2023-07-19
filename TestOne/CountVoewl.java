
/**
 * @author Debora Correa Batista Bastos 6213122
 * @since November 16, 2022
 */

import java.util.Scanner;

public class CountVoewl {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    // Declare variables
    int count = 0;
    System.out.println("Enter a sentence: ");
    String sentence = input.nextLine();

    // Initialize counter
    for (int counter = 0; counter < sentence.length(); counter++) {
      char ch = sentence.charAt(counter);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
        count++;
      }
    }
    // Result System out Print
    System.out.println("Number of vowels:  " + count);

    // Close scanner object
    input.close();
  }
}
