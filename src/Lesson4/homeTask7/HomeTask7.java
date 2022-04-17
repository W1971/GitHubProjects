/*7. Создайте массив строк. Заполните его произвольными именами
людей.
Отсортируйте массив.
*/

package Lesson4.homeTask7;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask7 {

  public static void main(String[] args) {

    String [] names = new String[3]  ;

    fillArray(names);
    Arrays.sort(names);
    printArray(names);

  }

  public static void fillArray( String [] names){
    System.out.println("Give the names : ");
    Scanner scanner = new Scanner(System.in);

    for ( int i= 0; i<names.length; i++){
        names [i] = scanner.nextLine();
      }
    }


  public static void printArray( String [] names){
    for ( String i : names){
      System.out.println(i);

    }
  }
}
