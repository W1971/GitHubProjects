/*. Создайте двумерный массив целых чисел. Выведите на консоль сумму
всех элементов массива.
*/

package Lesson5.homeTask4;


import static Lesson5.homeTask4.IntegerElements.function;

public class homeTask4 {
  public static void main(String[] args) {
    Integer[][] s = new Integer[][]{{7, 6, 12}, {6, 8, 11}};
    System.out.println(function(s));

  }
}