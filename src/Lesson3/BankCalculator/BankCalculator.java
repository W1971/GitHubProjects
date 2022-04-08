package Lesson3.BankCalculator;

import java.util.Scanner;

public class BankCalculator {


  public static <duuble> void main(String[] args) {

    System.out.println("Сумма важего депопзита :");
    Scanner sc = new Scanner(System.in);

    double number = sc.nextDouble();

    System.out.println("Спасибо! Вы внесли депозит на : " + number + " рублей");

    System.out.println("На сколко месяцев вы хотите внести ваш депозит :");
    Scanner month = new Scanner(System.in);

    int depositMonth = month.nextInt();

    if (depositMonth == 1) {

      System.out.println("Спасибо! Ваш депозит внесен на   " + depositMonth + "  месяц");

    }
    if (depositMonth >= 2 && depositMonth <= 4) {
      System.out.println("Спасибо! Ваш депозит внесен на   " + depositMonth + "  месяцa");

    } else {
      System.out.println("Спасибо! Ваш депозит внесен на   " + depositMonth + "  месяцев");
      System.out.println("Годовой банковский процент равен 18");

      float  bankTax = 18.4f;
      double calculatedDeposit;
      calculatedDeposit = number + (12 /(bankTax) * depositMonth);
      if (calculatedDeposit != 0) {
        System.out.println("Итого к  выплате  " + calculatedDeposit + " Рублей");
      }
    }
  }
}