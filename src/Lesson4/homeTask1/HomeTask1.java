/*0. Создайте массив целых чисел. Напишете программу, которая выводит
сообщение о том, входит ли заданное число в массив или нет.
Пусть число для поиска задается с консоли (класс Scanner).*/

package Lesson4.homeTask1;


import java.util.Scanner;

public class HomeTask1 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Please display array's length - ");
    int N = scanner.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      System.out.print("Fill array- ");
      int a = scanner.nextInt();
      arr[i] = a;
    }
    int temp = 0;
    System.out.print("Verify the number : - ");
    int m = scanner.nextInt();
    for (int i = 0; i < arr.length; i++) {
      if (m == arr[i]) {
        temp = arr[i];
      }
    }System.out.print("Your result : - " + temp);{
  }
}
}
