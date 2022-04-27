package Lesson8.ClassTasks.Task2.Proffesions.Vehicles;

public class SportCar  extends Car{
  protected int speed;

  public int getSpeed() {
    return speed;
  }

  public SportCar(String maker, String carClass, String mass,int speed) {
    super(maker, carClass, mass);
  }
}
