package Lesson6.HomeWork.HomeTask3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BankomatRules {}


/*


  protected static class Money {
    private int nominal;
    private int n;

    public Money(int nom, int n) {
      nominal = nom;
      this.n = n;
    }

    private void addMoney(int n) {
      this.n += n;
    }

    private boolean isMoney() {
      return n > 0;
    }

    private int getNominal() {
      return nominal;
    }

    private boolean cashIsNorm(int request) {
      return request <= n;
    }

    private void getMoney(int n) {
      this.n -= n;
      System.out.println(nominal + "RUB = " + n);
    }
  }

  protected static class Loc {
    int position;
    int n;

    public Loc(int p, int nn) {
      position = p;
      n = nn;

  public static void run() {
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("Choose an action: 1 - deposit money, 2 - withdrawMoney, 0 - Exit");
      try{
        int code = Integer.parseInt(sc.nextLine());
        Money atm = null;
        if(code == 0){
          break;
        }else if(code == 1){
          atm.setMoney();
        }else if(code == 2){
          assert atm != null;
          atm.getMoney();
        }else{
          System.err.println("Неизвестная операция");
        }
      }catch(NumberFormatException e){
        System.err.println("ВАй, ВАЙ, ВАЙ, какой тупой юзэр папалса!!!");
      }
    }
    sc.nextLine();
  }
  protected static class ATM {
    private Money[] b;
    private final int[] nam = new int[]{20, 50, 100};

    public ATM(int n) {
      b = new Money[nam.length];
      Random r = new Random();//для автозаполнения банкомата баблом
      for(int i = 0; i < n; i++){
        b[i] = new Money(nam[i], r.nextInt(100) + 1);//заполняем банкомат баблом
      }
    }

    private void setBablo() {
      System.out.println("Bankomat is charging !");
      Scanner sca = new Scanner(System.in);
      for(int i = 0; i < nam.length +1; i++){
        System.out.println("Enter banknotes by  " + nam[i] + " RUB");
        int n = Integer.parseInt(sca.nextLine());
        if(b[i] != null){
          b[i].addMoney(n);
        }
        else{
          b[i] = new Money(nam[i], n);
        }
      }
      sca.close();
    }

    private void getBablo() {
      System.out.print("AHTUNG! В банкомате наявны купюры ");
      printNam();
      System.out.println("\nEnter required summ");
      Scanner scan = new Scanner(System.in);
      int suma = Integer.parseInt(scan.nextLine());
      scan.close();
      System.out.println(colc(suma) ? "\n\n" : "Action is impossible \n\n");
    }

    private void printNam() {
      for(int i = 0; i < b.length; i++){
        if(b[i] != null && b[i].isMoney()){
          System.out.print(b[i].getNominal() + ", ");
        }
      }
    }

    private boolean colc(int suma) {
      ArrayList<Loc> l = new ArrayList<Loc>();
      if(suma % 10 != 0){
        return false;
      }
      else{
        for(int i = b.length - 1; i >= 0; i++){
          if(b[i] != null){
            //провепяеи хватит ли денег в банкомате
            int request = suma % b[i].getNominal();
            if(b[i].cashIsNorm(request)){//бабла хватае
              l.add(new Loc(i, request));
              suma -= request * b[i].getNominal();
            }
            if(suma == 0){
              break;
            }
          }
        }
        if(suma != 0){
          return false;
        }else{
          //Выдаем баблишко
          System.out.println("You received  following banknotes :");
          for(int i = 0; i < l.size(); i++){
            b[l.get(i).position].getMoney(l.get(i).n);
          }
          return true;
        }
      }
    }

  }


    }
  }
}
*/
