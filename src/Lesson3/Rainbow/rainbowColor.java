/*5. По введенному номеру определить цвет радуги (1 –
красный, 4 – зеленый и т. д.).*/

package Lesson3.Rainbow;

import java.util.Scanner;

public class rainbowColor {

  public static void main(String[] args) {
    System.out.println("Insert your number :");
    Scanner scanner = new Scanner(System.in);
    int color = scanner.nextInt();

    String rainbowColor;
    switch (color){
      case 1 : rainbowColor = "Red";
      break;
      case  2: rainbowColor = "Orange";
      break;
      case 3: rainbowColor = "Yellow";
      break;
      case 4: rainbowColor = "Green";
      break;
      case 5: rainbowColor = "Blue";
      break;
      case 6: rainbowColor = "DarkBlue";
      break;
      case 7: rainbowColor = "Violet";
      break;
      default: rainbowColor= "Not such color";
        break;
    }
    System.out.println("Rainbow color is :" + rainbowColor);
  }
}

