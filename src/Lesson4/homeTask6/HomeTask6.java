/*6. Создайте массив и заполните массив.
Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль.
Снова выведете массив на экран на отдельной строке.*/

package Lesson4.homeTask6;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask6 {
  public static void main(String[] args) {
    int n, arr[];
    Scanner in = new Scanner(System.in);
    System.out.print("Enter array value  :");
    n = in.nextInt();
      arr = new int[n];
      for (int i = 0; i < arr.length; i++)
        arr[i] = (int) (Math.random() * n);
      for (int i : arr)
        System.out.print(i + " ");

    for (int i = 0; i < arr.length; i++) {
      if(i%2 == 1){
        arr[i] = 0;
      }
    }
    System.out.println();
    System.out.println(Arrays.toString(arr));
  }
}

