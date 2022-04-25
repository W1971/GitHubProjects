package Lesson7.HomeTask3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sklad_Info {
//Система учета товаров на складе



  //наименование, марка, серийный номер
  public static class Sklad {
    private String nameSklad;
    private ListSklad[] list_sklad;
    public Sklad () {
    }
    public void setNameSklad(String nameSklad){
      this.nameSklad=nameSklad;
    }
    class ListSklad {
      private String names;
      private String marks;
      private int numbers;
      public ListSklad (String names, String marks, int numbers) {
        this.names = names;
        this.marks = marks;
        this.numbers = numbers;
      }
      public String getNames(){
        return this.names;
      }
      public String getMarks(){
        return this.marks;
      }
      public int getNumbers(){
        return this.numbers;
      }
    }
    public void setList() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите количество товаров:");
      int k = sc.nextInt();
      list_sklad = new ListSklad[k];
      for (int i = 0; i < list_sklad.length; i++) {
        System.out.println("Наименование "+(i+1)+"-го товара: ");
        String names=sc.nextLine();
        names=sc.nextLine();
        System.out.println("Какая марка товара?");
        String marks=sc.nextLine();
        System.out.println("Серийный номер товара:");
        int numbers=sc.nextInt();
        list_sklad[i]=new ListSklad(names,marks,numbers);
      }
    }
    public void printAll() {
      if(list_sklad.length!=0)
        System.out.println("Город: "+this.nameSklad+"\nКоличество товаров: "+list_sklad.length);
      for (int i = 0; i < list_sklad.length; i++) {
        System.out.print(" Наименование "+(i+1)+"-го товара: "+this.list_sklad[i].getNames()+"; ");
        System.out.print(" Марка товара: "+this.list_sklad[i].getMarks()+"; ");
        System.out.println(" Серийный номер: "+this.list_sklad[i].getNumbers()+"; ");
        String source=" Наименование "+(i+1)+"-го товара: "+this.list_sklad[i].getNames()+"; "+"Марка "+(i+1)+"-го товара: "+this.list_sklad[i].getMarks()+"; "+"Серийный номер "+(i+1)+"-го товара: "+this.list_sklad[i].getNumbers()+";";

        File myFile = new File("StoresRiga.txt");

        System.out.println("Удалаяем файлы если они уже были созданы.");
        if (myFile.exists()) {
          myFile.delete();
        }

        File fp = new File("/home/linyx/Desktop/JAVA/TMS/GitHubProjects/src/Lesson7/HomeTask3"+ nameSklad);
        System.out.println("Создаем дерикторию StoreRiga");
        System.out.println("Проверяем: ");
        fp.mkdirs();
        if(fp.exists()) {
          System.out.println("Каталог "+fp.getName() + " существует.");
        }
        try {
          FileWriter f2 = new FileWriter("NewStockRiga",true);
          f2.write(source);
          f2.close();
        }
        catch (IOException e){
          e.printStackTrace();
        }
        System.out.println("Выполнено успешно.");
      }
      if(list_sklad.length==0)
        System.out.println("Ошибка!!! Попробуйте начать сначала!!!");
    }
  }
}
