package Lesson6.HomeWork.CreditCardonline;

import java.util.Scanner;

public class Testercard {
  public static void main(String[] args) {
    CreditCard creditCard1 = new CreditCard(1,1000);
    CreditCard creditCard2 = new CreditCard(2,500);
    CreditCard creditCard3 = new CreditCard(3,5000);

    System.out.println("Enter summ: ");
    Scanner scanner = new Scanner(System.in);
    int sum1 = scanner.nextInt();
    creditCard1.addSumm(sum1);
    System.out.println(creditCard1);
    System.out.println("********************");

    System.out.println("Enter summ: ");
    int sum2 = scanner.nextInt();
    creditCard2.addSumm(sum2);
    System.out.println(creditCard2);
    System.out.println("********************");

    System.out.println("Enter summ: ");
    int sum3 = scanner.nextInt();
    creditCard3.minusSumm(sum3);
    System.out.println(creditCard3);
    System.out.println("********************");

  }
}
