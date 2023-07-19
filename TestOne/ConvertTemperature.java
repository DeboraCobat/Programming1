import java.util.Scanner;

/**
 * @author Debora Correa Batista Bastos 6213122
 * @since November 16, 2022
 */

public class ConvertTemperature {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double fahrenheit, celsius;

    System.out.println("Choose the conversion wanted:\n 1. Celsius to Fahrenheit  \n 2. Fahrenheit to Celsius");
    int choice = input.nextInt();
    switch (choice) {
      case 1:
        System.out.println("Enter Celsius temperature");
        celsius = input.nextDouble();
        fahrenheit = 9.0 / 5.0 * celsius + 32;
        System.out.println("Fahrenheit temperature is = " + fahrenheit);

        break;

      case 2:
        System.out.println("Enter Fahrenheit temperature");
        fahrenheit = input.nextDouble();
        celsius = 5.0 / 9.0 * (fahrenheit - 32);
        System.out.println("Celsius temperature is = " + celsius);
        break;

      default:
        System.out.println("please choose valid choice");
        break;

    }
    input.close();
  }
}
