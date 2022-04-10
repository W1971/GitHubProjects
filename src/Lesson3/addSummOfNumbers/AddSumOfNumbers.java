/* 3. Напишите программу, где пользователь вводит любое целое
положительное число. А программа суммирует все числа от 1 до
введенного пользователем числа.
Для ввода числа воспользуйтесь классом Scanner.*/

package Lesson3.addSummOfNumbers;

import java.util.Scanner;

public class AddSumOfNumbers {
  public static void main(String[] args) {
    System.out.print("Type any positive integer: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int sum = 0;
    for (int i=1; i<= n; i++){
      sum = sum + i;
    }
    System.out.println ("Сумма всех чисел нуля до  " +  n  + " равна "  + sum);
  }
  }

