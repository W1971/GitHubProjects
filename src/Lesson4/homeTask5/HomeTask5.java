/*5. Создайте массив из n случайных целых чисел и выведите его на экран.//ok
Размер массива пусть задается с консоли и размер массива может быть
больше 5 и меньше или равно 10.//ok
Если n не удовлетворяет условию - выведите сообщение об этом.//ok
Если пользователь ввёл не подходящее число, то программа должна
просить пользователя повторить ввод.//ok
Создайте второй массив только из чётных элементов первого массива,
если они там есть, и вывести его на экран.*/



package Lesson4.homeTask5;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask5 {

  public static void main(String[] args) {
      int n , arr[];

      Scanner in = new Scanner(System.in);
      System.out.print("Array value range from 5 to 10: ");
      n = in.nextInt();
      if (n>5 && n<=10) {
        arr = new int[n];
        for (int i = 0; i < arr.length; i++)
          arr[i] = (int) (Math.random() * n);
        for (int i : arr)
        System.out.print( i + " ");
      } else {
        System.out.println("Please insert correct numbers ");
        return;
      }

        int [] evenArr = new arr[i];
        int evenNums = 0;

        for (int i = 0; i < arr.length; i++) {
          //evenArr[i] = (int)(Math.random()*(n+1));
          if(arr[i]%2 == 0){
            evenNums++;
          }System.out.println(Arrays.toString(evenArr));
        }


        int [] arr2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
          if(evenArr[i]%2 == 0){
            arr2[index] = evenArr[i];
            index++;
          }
        }
        System.out.println(Arrays.toString(arr2));

      }

    }


