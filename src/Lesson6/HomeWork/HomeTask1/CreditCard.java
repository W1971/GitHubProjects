/*
1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
        Добавьте метод, который позволяет начислять сумму на кредитную
        карточку.
        Добавьте метод, который позволяет снимать с карточки некоторую сумму.
        Добавьте метод, который выводит текущую информацию о карточке.
        Напишите программу, которая создает три объекта класса CreditCard у
        которых заданы номер счета и начальная сумма
        Тестовый сценарий для проверки:
        Положите деньги на первые две карточки и снимите с третьей.
        Выведите на экран текущее состояние всех трех карточек.
*/

package Lesson6.HomeWork.HomeTask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class CreditCard {

  private String ownerName;
  private CurrencyType currency;
  private String pinCode;
  private long cardNumber;
  private double balance;

  public CreditCard() {
  }

  public CreditCard(String ownerName, CurrencyType currency, String pinCode, long cardNumber, int balance)
          throws MinusCardNumberException, ShortOwnerNameException, MaximumBallanceAllovable {
    if (ownerName.length() < 5) throw new ShortOwnerNameException(ownerName);
    this.ownerName = ownerName;
    this.currency = currency;
    this.pinCode = pinCode;
    if (cardNumber < 0) throw new MinusCardNumberException(cardNumber);
    this.cardNumber = cardNumber;
    this.balance = balance;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) throws ShortOwnerNameException {
    if (ownerName.length() < 5) throw new ShortOwnerNameException(ownerName);
    this.ownerName = ownerName;
  }

  public CurrencyType getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

  public String getPinCode() {
    return pinCode;
  }

  public void setPinCode(String pinCode) throws WrongPinCodeExeptions {
    if (!Objects.equals(pinCode, "qaz")) throw new WrongPinCodeExeptions(pinCode);
    this.pinCode = pinCode;
  }

  public long getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(long cardNumber) throws MinusCardNumberException {
    if (cardNumber < 0) throw new MinusCardNumberException(cardNumber);
    this.cardNumber = cardNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public boolean getMoney(double sum) throws MinusBalanceException {
    if (balance < sum) throw new MinusBalanceException(balance, sum);
    balance -= sum;
    System.out.println("Card Balance: " + balance);
    return true;
  }


  public void createBankCard() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      System.out.println("Enter Card Owner Name");
      try {
        setOwnerName(reader.readLine());
        break;
      } catch (ShortOwnerNameException e) {
        System.out.println(e);
      }
    }

    int currencyType = 0;
    while (true) {
      System.out.println("Currency type: \n 1 - USD \n 2 - EURO \n 3 - RUB \n 4- Switzerland  Franks");
      try {
        currencyType = Integer.parseInt(reader.readLine());
        break;
      } catch (NumberFormatException e) {
        e.printStackTrace();
      }
    }

    switch (currencyType) {
      case 1:
        setCurrency(CurrencyType.USD);
        break;
      case 2:
        setCurrency(CurrencyType.EUR);
        break;
      case 3:
        setCurrency(CurrencyType.SGD);
        break;
      default:
        setCurrency(CurrencyType.RUB);
    }

    while (true) {
      System.out.println("Enter pin-Code");

      try {
        setPinCode(reader.readLine());
        break;
      } catch (WrongPinCodeExeptions e) {
        e.printStackTrace();
      }

      try {
        System.out.println("Enter card number");
        setCardNumber(Long.parseLong(reader.readLine()));
        break;
      } catch (MinusCardNumberException e) {
        System.out.println(e);
      } catch (NumberFormatException eNumb) {
        eNumb.printStackTrace();
      }
    }

    while (true) {
      System.out.println("Enter balance");
      try {
        setBalance(Double.parseDouble(reader.readLine()));
        break;
      } catch (NumberFormatException e) {
        e.printStackTrace();
      }
    }

    System.out.println("Credit card is created and saved \n" + this);
  }

  @Override
  public String toString() {
    return "BankCard{" +
            "ownerName='" + ownerName + '\'' +
            ", currency=" + currency +
            ", pinCode='" + pinCode + '\'' +
            ", cardNumber=" + cardNumber +
            ", balance=" + balance +
            '}';
  }


  public class MinusCardNumberException extends Exception {
    public MinusCardNumberException(long cardNumber) {
      super("Card number cannot be negative " + cardNumber + "");
    }
  }

  public class ShortOwnerNameException extends Exception {
    public ShortOwnerNameException(String ownerName) {
      super("Minimum length of owner name is 5 characters " + ownerName + "");
    }
  }

  public class MinusBalanceException extends Exception {
    public MinusBalanceException(double balance, double sum) {
      super("Not enough money on your account \n Your balance: " + balance + "\n Summ: " + sum);
    }
  }


  private class MaximumBallanceAllovable extends Exception {
    public MaximumBallanceAllovable(double balance, double sum) {
      super("You exceeded max daily limit");

    }
  }

  public class WrongPinCodeExeptions extends Exception {
    public WrongPinCodeExeptions(String pinCode) {
      super("Ваш pin-code не верный \n proper Pin-code is  qaz ");
    }
  }
}






