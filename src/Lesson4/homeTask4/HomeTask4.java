/*4. Создайте 2 массива из 5 чисел.-ok
Выведите массивы на консоль в двух отдельных строках.-ok
Посчитайте среднее арифметическое элементов каждого массива и
сообщите, для какого из массивов это значение оказалось больше (либо
сообщите, что их средние арифметические равны).*/

package Lesson4.homeTask4;

import java.util.Scanner;

public class HomeTask4 {

  public static void main(String[] args) {

    double sumArr1 = 0, sumArr2 = 0;

    int[] Arr1 = new int[5];
    for (int i = 0; i < Arr1.length; i++) {
      Arr1[i] = (int) (Math.random() * 6);
      System.out.print(Arr1[i] + " ");

      sumArr1 += (double) Arr1[i] / Arr1.length;
    }
    System.out.println(" ");

    int[] Arr2 = new int[5];
    for (int i = 0; i < Arr2.length; i++) {
      Arr2[i] = (int) (Math.random() * 6);
      System.out.print(Arr2[i] + " ");
      sumArr2 += (double) Arr2[i] / Arr2.length;
    }
    System.out.println(" ");

    if (sumArr1 == sumArr2) System.out.println("Средние арифметические значения двух массивов равны");
    else {
      if (sumArr1 > sumArr2)
        System.out.println("Среднее арифметическое значение первого массива больше и равно "+ sumArr1);
      else System.out.println("Среднее арифметическое значение второго массива больше и равно " + sumArr2);
    }
  }
}