package Lesson4.arraysOnline;

import java.util.Scanner;

public class classTask {
  public static void main(String[] args) {


    int []  arr = new int[5];

    fillArray(arr);
    printArray(arr);

  }
    public static void fillArray( int [] arr){
      System.out.println("Fill array: ");
      Scanner scanner = new Scanner(System.in);
      
           for ( int i= 0; i<arr.length; i++){
             if (scanner.hasNextInt()){
               arr[i] = scanner.nextInt();
             } else {
               System.out.println("Enter the number");
             }
           }
    }


    public static void printArray( int [] arr){
      for ( int i= 0; i<arr.length; i++){
        System.out.println("arr [ " + i + "] = " + arr[i]);
    }
  }
}
