package Lesson7.HomeTask3;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Test {

  //хотите фиксированый размер
  public Goods[] goods = new Goods[5];
  //вот вам динамический
  //public List<Goods> goods = new ArrayList<Goods>();

  private class Goods {

    private String name;
    private int price;
    private Image img;

  }

}
