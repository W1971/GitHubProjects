package Lesson6.classWork.homeTask1;

import java.util.Scanner;

public class InputMetod {


  public static void enterYourName( String  name){
    System.out.println("What is your name : ");
    Scanner scanner = new Scanner(System.in);
      name  = scanner.nextLine();
    }


  public static void yourName( String  name){
      System.out.println(name);

    }
  }




//
//
//  Scanner sc = new Scanner(System.in);
//    System.out.print("The range of the array is from 5 to 10: ");
//
//
//            while (5 >= n || n >= 10) {
//            if (sc.hasNextInt()) {
//            n = sc.nextInt();
//            if (n < 5 || n > 10) {
//        System.out.println("The number entered must be greater than 5 and less than 10. Repeat the entry:");
//        }
//        } else {
//        System.out.println("You entered a wrong number. Repeat the entry:");
//        sc.next();
//        }
//        }