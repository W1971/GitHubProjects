package Lesson8.ClassTasks.Task2.Proffesions.Vehicles;

public class Lorry extends Car{

  private int deadweight;

  public int getDeadweight() {
    return deadweight;
  }

  public Lorry(String maker, String carClass, String mass,int deadweight) {
    super(maker, carClass, mass);
  }
}
