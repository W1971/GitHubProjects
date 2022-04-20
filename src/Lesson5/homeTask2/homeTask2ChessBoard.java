/*2. Шахматная доска
Создать программу для раскраски шахматной доски с помощью цикла.
Создать двумерный массив String'ов 8х8. С помощью циклов задать
элементам циклам значения B(Black) или W(White). Результат работы
программы:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W*/

package Lesson5.homeTask2;

import java.util.Scanner;

public class homeTask2ChessBoard {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter board dimension 'a''b': ");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    for(int i=0;i<a;i++){
      for(int j=0;j<b;j++)
        if((i+j)%2==0)
          System.out.print("W ");
        else
          System.out.print("B ");
      System.out.println();
    }

  }

}

