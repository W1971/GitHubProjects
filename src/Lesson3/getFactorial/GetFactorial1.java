package Lesson3.getFactorial;

import java.util.Scanner;

public class GetFactorial1 {

  public static void main(String[] args) {

    int q, a, fact = 1;

    System.out.println("Please Enter a number:");
    Scanner in = new Scanner(System.in);
    q = in.nextInt();
    if (q < 0)
      System.out.println("Please enter a number greater than 0:");
    if (q == 0 ){
      System.out.println("Factorial of " + q + " is = " + fact);
    }
    else {
    for (a = 1; a <= q; a++)
      fact = fact * a;
    System.out.println("Factorial of " + q + " is = " + fact);

    }
  }
}