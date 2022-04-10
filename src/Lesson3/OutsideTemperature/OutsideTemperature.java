/*4. Для введенного числа t (температура на улице) вывести
Если t>–5, то вывести «Тепло».
Если –5>= t > –20, то вывести «Нормально».
Если –20>= t, то вывести «Холодно».*/

package Lesson3.OutsideTemperature;

import java.util.Scanner;

public class OutsideTemperature {
  public static void main(String[] args) {
    System.out.println("Please insert outside temperature :");
    Scanner sc = new Scanner(System.in);
    int temp = sc.nextInt();


  if ( temp > -5 && temp < 55){
    System.out.println("Outside is warm");

    } if ( temp >= -20 &&  temp <= -5){
      System.out.println("Outside is normal");
    }else {
      System.out.println("Outside is cold");
    }

  }

}
