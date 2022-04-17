/*1. Создайте массив целых чисел. Удалите все вхождения заданного
числа из массива.
Пусть число задается с консоли (класс Scanner). Если такого числа нет -
выведите сообщения об этом.
В результате должен быть новый массив без указанного числа.*/

package Lesson4.homeTask2;

import java.util.Scanner;

public class HomeTask2 {
  public static void main(String[] args) {
    int number;
    Scanner obj=new Scanner(System.in);
    System.out.print("Array's length : ");
    number=obj.nextInt();
    int[] array = new int[number];
    System.out.println("Fill up array: " + " ");
    for(int i=0; i<number; i++)
    {
      array[i]=obj.nextInt();
    }
    System.out.print("Array contains : " + " ");
    for (int i=0; i<number; i++)
    {
      System.out.print(array[i] + " ");
    }
    int temp = 0;
    System.out.print("Verify the number : - ");
    int m = obj.nextInt();
    for (int i = 0; i < array.length; i++) {
      if (m == array[i]) {
        temp = array[i];
      }
    }System.out.print("Your result : - " + temp);
  }
}

