/*//1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
При решении используйте операцию инкремента (++).*/

package Lesson3.OddNumbers;

public class getOddNumbers {

  public static void main(String[] args) {
    int num = 1;
    for (; num <=99; num++){
      if (num %2 !=0){
        System.out.printf("%4d",num);
      }
    }
  }
}
