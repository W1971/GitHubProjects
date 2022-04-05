package Lesson2_Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MyScannerNewFile {

    public static void main(String[] args) throws IOException {
    File file = new File("/home/linyx/Desktop/JAVA/TMS/GitHubProjects/src/Lesson2_Scanner/art.txt");
    try {
      Scanner sc = new Scanner(file);
      while (sc.hasNextLine()) {
        String line = sc.nextLine();
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    }
  }

