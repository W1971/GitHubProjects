/*3. Создайте и заполните массив случайным числами -ok
 и выведете максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random().-ok
Пусть будет возможность создавать массив произвольного размера.-ok
Пусть размер массива вводится с консоли.*/


package Lesson4.homeTask3;


import java.util.Arrays;
import java.util.Scanner;

public class HomeTask3RandomNumbers {

  public static void main(String[] args) {

      int n, arr[];
      Scanner in = new Scanner(System.in);
      System.out.print("Fill up array length: ");
      n = in.nextInt();
      arr = new int[n];
      for (int i = 0; i < arr.length; i++)
        arr[i] = (int) (Math.random() * n);
         Arrays.sort(arr);
         System.out.println(  Arrays.toString(arr));


    int max = getMax(arr);
    System.out.println("Maximum Value is: "+max);

    int min = getMin(arr);
    System.out.println("Minimum Value is: "+min);
  }


  public static int getMax(int[] inputArray){
    int maxValue = inputArray[0];
    for(int i=1;i < inputArray.length;i++){
      if(inputArray[i] > maxValue){
        maxValue = inputArray[i];
      }
    }
    return maxValue;
  }


  public static int getMin(int[] inputArray){
    int minValue = inputArray[0];
    for(int i=1;i<inputArray.length;i++){
      if(inputArray[i] < minValue){
        minValue = inputArray[i];
      }
    }
    return minValue;
  }
}
