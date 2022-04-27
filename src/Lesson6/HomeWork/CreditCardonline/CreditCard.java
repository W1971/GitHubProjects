package Lesson6.HomeWork.CreditCardonline;

public class CreditCard {

  private int number;
  private int summ;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public int getSumm() {
    return summ;
  }

  public void setSumm(int summ) {
    this.summ = summ;
  }

  @Override
  public String toString() {
    return "Card info : \n " + this.number +"\n " + this.summ + "\n";
  }

  public CreditCard(int number, int summ) {
    this.number = number;
    this.summ = summ;

  }
  public void  addSumm( int additionaSumm){
    if ( additionaSumm<0){
      System.out.println("Wronng summ");
      return;
    } this.summ +=additionaSumm;
    System.out.println("Succesfull");
  }
  public void minusSumm(int minusSumm){
    if(minusSumm < 0 || minusSumm >this.summ){
      System.out.println("Summ is not correct");
      return;
    }

    this.summ -=minusSumm;
    System.out.println("Successful");

  }
}
