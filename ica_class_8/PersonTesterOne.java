// program desingned by Debora Correa Batista Bastos
// purpose create Person class for ICA _8_1

package ica_class_8;

import java.util.Scanner;

public class PersonTesterOne {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("What is your first name? ");
    String firstName = input.next();
    System.out.print("What is your last name? ");
    String lastName = input.next();
    System.out.print("What is your age? ");
    int age = input.nextInt();

    Person person = new Person(firstName, lastName, age);

    person.printPerson();

  }

}