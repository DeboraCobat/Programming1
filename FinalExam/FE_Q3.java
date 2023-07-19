// program developed by Debora Correa Batista Bastos 6213122
// final exam November 22nd 2022

package FinalExam;

import java.util.*;

public class FE_Q3 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int arrayLength;
    System.out.printf("Enter size of the Array:");
    arrayLength = input.nextInt();

    int[] numbers = new int[arrayLength];

    System.out.printf("Enter a series of %d integers with spaces in between:", arrayLength);
    for (int counter = 0; counter < arrayLength; counter++) {
      numbers[counter] = input.nextInt();
    }

    int smallestElement = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < smallestElement) {
        smallestElement = numbers[i];
      }
    }
    System.out.println("The smallest element is: " + smallestElement);

    input.close();

  }
}
