/*1. Создать трехмерный массив из целых чисел.
С помощью циклов "пройти" по всему массиву и увеличить каждый
элемент на заданное число. Пусть число, на которое будет
увеличиваться каждый элемент, задается из консоли.*/

package Lesson5.homeTask1;

public class HomeTask13DArray {
  public static void main(String[] args) {
    int[][][] test = {
            {
                    {1, -2, 3},
                    {2, 3, 4}
            },
            {
                    {-4, -5, 6, 9},
                    {1},
                    {2, 3}
            }
    };

    // for..each loop to iterate through elements of 3d array
    for (int[][] array2D: test) {
      for (int[] array1D: array2D) {
        for(int item: array1D) {

          System.out.print(item);
        }
      }
    }
  }
}

