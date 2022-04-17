/*За каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите программу, в которую пользователь вводит сумму вклада и
количество месяцев. А банк вычисляет конечную сумму вклада с учетом
начисления процентов за каждый месяц.
Для вычисления суммы с учетом процентов используйте цикл for. Пусть
сумма вклада будет представлять тип float*/

package Lesson3.BankCalculator;

import java.util.Scanner;

public class BankCalculator {


  public static  void main(String[] args) {

    System.out.println("Сумма вашего депопзита :");
    Scanner sc = new Scanner(System.in);

    double deposit = sc.nextDouble();

    System.out.println("Спасибо! Вы внесли депозит на : " + deposit + " рублей");

    System.out.println("На сколко месяцев вы хотите внести ваш депозит :");
    Scanner month = new Scanner(System.in);

    double depositMonth = month.nextDouble();

    if (depositMonth == 1) {

      System.out.println("Спасибо! Ваш депозит внесен на   " + depositMonth + "  месяц");

    }
    if (depositMonth >= 2 && depositMonth <= 4) {
      System.out.println("Спасибо! Ваш депозит внесен на   " + depositMonth + "  месяцa");

    } else {
      System.out.println("Спасибо! Ваш депозит внесен на   " + depositMonth + "  месяцев");
    }
      System.out.println(" Банковский процент в месяц : 7%");

      float  monthlyBankTax = 7.0f;
      double calculatedDeposit;
      double totalMonth = 1;
      calculatedDeposit = deposit + monthlyBankTax * depositMonth;
      if (calculatedDeposit != 0) {
        for ( totalMonth =1; totalMonth<= depositMonth ; totalMonth++){
          System.out.println(totalMonth + " .месяц"   );
        }

        System.out.println("Итого к  выплате  " + calculatedDeposit + " Рублей");
      }
    }
  }
