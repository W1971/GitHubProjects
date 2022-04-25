/*1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную
карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard у
которых заданы номер счета и начальная сумма
Тестовый сценарий для проверки:
Положите деньги на первые две карточки и снимите с третьей.
Выведите на экран текущее состояние всех трех карточек.*/

package Lesson6.HomeWork.HomeTask1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreditCardMain {

  public static void main(String[] args) throws IOException, CreditCard.WrongPinCodeExeptions {
    CreditCard myCard = new CreditCard();
    myCard.createBankCard();

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      System.out.println("Amount to withdraw");
      try {
        myCard.getMoney(Double.parseDouble(reader.readLine()));
        break;
      } catch (CreditCard.MinusBalanceException | NumberFormatException e) {
        System.out.println(e);
      }
    }

    System.out.println(myCard);
  }
}


