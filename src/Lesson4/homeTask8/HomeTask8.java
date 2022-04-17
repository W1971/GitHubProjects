/*7. 8.Реализуйте алгоритм сортировки пузырьком.*/

package Lesson4.homeTask8;

import java.util.Arrays;

public class HomeTask8 {
  public static void main(String[] args) {

      int [] arr = {134, 53, 77, 56, 205};

      boolean isSorted = false;
      int temp;
      while(!isSorted) {
        isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
          if(arr[i] > arr[i+1]){
            isSorted = false;

            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
          }
        }
      }
      System.out.println(Arrays.toString(arr));
    }
  }
