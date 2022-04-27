package Lesson8.HomeWork.HomeTask3;

public class Dentist extends Doctor {


  public Dentist(String occupation, String name, int fee) {
    super(occupation, name, fee);
  }

  @Override
  public void curing() {
    super.curing();
    System.out.println("Dentist is curing your teeth");
  }

  public static void main(String[] args) {
    Doctor obj = new Dentist("Dentist", "Boob", 15);
    System.out.println( obj);
    obj.curing();


  }
  }
