package Lesson6.classWork.homeTask1;

public class AccountData {

  private String cardType;
  private int CreditCardNumber;
  private int CreditCardExpiryDate;
  private int CreditCardVerificationNumbers;
  private boolean CardAccessCode;




  public String getCardType() {
    if(cardType!="Visa") System.out.println("Only VisaCard is accepted");
    else
    return cardType;
    return null;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public int getCreditCardNumber() {
    if(CreditCardNumber!=1234567) System.out.println("Wrong entry !!!");
    return CreditCardNumber;
  }

  public void setCreditCardNumber(int creditCardNumber) {
    CreditCardNumber = creditCardNumber;
  }

  public int getCreditCardExpiryDate() {
    return CreditCardExpiryDate;
  }

  public void setCreditCardExpiryDate(int creditCardExpiryDate) {
    CreditCardExpiryDate = creditCardExpiryDate;
  }

  public int getCreditCardVerificationNumbers() {
    return CreditCardVerificationNumbers;
  }

  public void setCreditCardVerificationNumbers(int creditCardVerificationNumbers) {
    CreditCardVerificationNumbers = creditCardVerificationNumbers;
  }

  public boolean isCardAccessCode() {
    return CardAccessCode;
  }

  public void setCardAccessCode(boolean cardAccessCode) {
    CardAccessCode = cardAccessCode;
  }
}
