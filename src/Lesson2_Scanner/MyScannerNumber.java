package Lesson2_Scanner;


import java.util.Scanner;

public class MyScannerNumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Please insert your number : ");
    int i = sc.nextInt();
    System.out.println("Your number is :" + i);

  }
}
