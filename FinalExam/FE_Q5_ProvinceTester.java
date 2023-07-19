// program developed by Debora Correa Batista Bastos 6213122
// final exam November 22nd 2022

package FinalExam;

import java.util.Scanner;
import java.lang.*;

public class FE_Q5_ProvinceTester {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("What is the Province name? ");
    String provinceName = input.nextLine();
    System.out.printf("What is the Province population? ");
    int provincePopulation = input.nextInt();
    System.out.println();
    System.out.println("What is the Province Capital? ");
    String provinceCapital = input.next();
    System.out.println();
    System.out.printf("What is the Province area? ");
    double provinceArea = input.nextDouble();
    System.out.println();

    Province province = new Province(provinceName, provincePopulation, provinceCapital, provinceArea);

    province.printProvince();
  }
}
