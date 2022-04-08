package Lesson3.OutsideTemperature;

import java.util.Scanner;

public class OutsideTemperature {
  public static void main(String[] args) {
    System.out.println("Please insert outside temperature :");
    Scanner sc = new Scanner(System.in);
    int temp = sc.nextInt();


  if ( temp >5){
    System.out.println("Outside is warm");

    } if ( temp > -20 &&  temp <= 5){
      System.out.println("Outside is normal");
    }else {
      System.out.println("Outside is cold");
    }

  }

}
