package Lesson3.OddNumbers;

public class getOddNumbers {

  public static void main(String[] args) {
    int num = 1;
    for (; num <=99; num++){
      if (num %2 !=0){
        System.out.print(num);
      }
    }
  }
}
