// program developed by Debora Correa Batista Bastos 6213122
// final exam November 22nd 2022

package FinalExam;

public class Province {

  private String provinceName;
  private int provincePopulation;
  private String provinceCapital;
  private double provinceArea;

  public Province(String name, int population, String capital, double area) {
    setProvince(name, population, capital, area);
  }

  public String getProvinceName() {
    return this.provinceName;
  }

  public void setProvinceName(String provinceName) {
    this.provinceName = provinceName;
  }

  public int getProvincePopulation() {
    return this.provincePopulation;
  }

  public void setProvincePopulation(int provincePopulation) {
    this.provincePopulation = provincePopulation;
  }

  public String getProvinceCapital() {
    return this.provinceCapital;
  }

  public void setProvinceCapital(String provinceCapital) {
    this.provinceCapital = provinceCapital;
  }

  public double getProvinceArea() {
    return this.provinceArea;
  }

  public void setProvinceArea(double provinceArea) {
    this.provinceArea = provinceArea;
  }

  public void setProvince(String name, int population, String capital, double area) {
    if (name != "") {
      provinceName = name;
    } else {
      provinceName = "";
    }

    if (population > 0) {
      provincePopulation = population;
    } else {
      provincePopulation = 0;
    }

    if (capital != "") {
      provinceCapital = capital;
    } else {
      provinceCapital = "";
    }

    if (area > 0) {
      provinceArea = area;
    } else {
      provinceArea = 0;
    }
  }

  public void printProvince() {

    System.out.println("The Province name is: " + provinceName);
    System.out.printf("The Province population is: " + provincePopulation);
    System.out.println("The Province Capital is: " + provinceCapital);
    System.out.printf("The Province area is: " + provinceArea);

  }
}