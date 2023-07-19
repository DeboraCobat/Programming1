// program desingned by Debora Correa Batista Bastos
// purpose create Person class for ICA _8_1

package ica_class_8;

public class Person {

  private String personFirstName;
  private String personLastName;
  private int personAge;

  public Person(String firstName, String lastName, int age) {
    setPerson(firstName, lastName, age);
  }

  public String getFirstName() {
    return this.personFirstName;
  }

  public String getLastName() {
    return this.personLastName;
  }

  public int getAge() {
    return this.personAge;
  }

  public void setPerson(String firstName, String lastName, int age) {
    if (firstName != "") {
      personFirstName = firstName;
    } else {
      personFirstName = "";
    }

    if (lastName != "") {
      personLastName = lastName;
    } else {
      personLastName = "";
    }

    if (age > 0) {
      personAge = age;
    } else {
      personAge = 0;
    }
  }

  public void printPerson() {

    System.out.println("The person's full name is: " + personFirstName + " " + personLastName);

    if (personAge >= 18) {
      System.out.println("The person is an adult.");
    } else {
      System.out.println("The person is a kid.");
    }
  }

}
