//3. Напишите программу, которая выводит на консоль таблицу умножения.

package Lesson3.multiplyTable;

public class multiplyTable {
  public static void main(String[] args) {
    int[][] multiplyTable  = new int[10][10];

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        multiplyTable[i][j] = (i+1)*(j+1);
        System.out.printf("%5d", multiplyTable[i][j]);
      }
      System.out.println();
    }
  }
}



