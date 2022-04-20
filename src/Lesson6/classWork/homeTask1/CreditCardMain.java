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

package Lesson6.classWork.homeTask1;

public class CreditCardMain {
  public static void main(String[] args) {

    PersonalInformation name = new PersonalInformation();
    name.setName("Vladimir");
    System.out.println("Your name is  " + name.getName());
    System.out.println();

    PersonalInformation dob = new PersonalInformation();
    dob.setDateOfBirth(240371);
    System.out.println("Your DOB " + dob.getDateOfBirth());
    System.out.println();

    AccountData cardType = new AccountData();
    cardType.setCardType("Visa");
    System.out.println("Your card is :" + cardType.getCardType());
    System.out.println();

    AccountData cardNumber = new AccountData();
    cardNumber.setCreditCardNumber(1234567);
    System.out.println("Your card number is  " +cardNumber.getCreditCardNumber());
    System.out.println();






  }
}
