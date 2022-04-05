package Lesson2_Scanner;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MyScannerFile {
  public static void main(String[] args)  {

    try {
      FileReader reader = new FileReader("/home/linyx/Desktop/JAVA/TMS/GitHubProjects/src/Lesson2_Scanner/Dog.txt");
      int data = reader.read();
      while (data != -1){
        System.out.print((char)data);
         data = reader.read();}
        reader.close();


    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
