/*Основное задание
1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную
карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard у
которых заданы номер счета и начальная сумма
Тестовый сценарий для проверки:
Положите деньги на первые две карточки и снимите с третьей.
Выведите на экран текущее состояние всех трех карточек.*/

package Lesson6.classWork.homeTask1;

import java.util.Objects;

public class PersonalInformation {


  private String name;
  private int dateOfBirth;
  private int cardHolderInformation;

  public int getCardHolderInformation() {
    return cardHolderInformation;
  }

  public void setCardHolderInformation(int cardHolderInformation) {
    this.cardHolderInformation = cardHolderInformation;
  }

  public String getName() {
    if (!Objects.equals(name, "Vladimir"))
      return "It's wrong name";
    else
      return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDateOfBirth() {
    if (dateOfBirth != 240371)
      System.out.println("Please verify your DOB");
      return dateOfBirth;

  }

  public void setDateOfBirth(int dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
}

