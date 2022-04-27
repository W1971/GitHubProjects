package Lesson8.ClassTasks.Task2.Proffesions.Vehicles;

public class Car {
  protected String maker;
  protected String carClass;
  protected String mass;

  public Car(String maker, String carClass, String mass) {
    this.maker = maker;
    this.carClass = carClass;
    this.mass = mass;
  }

  public String getMaker() {
    return maker;
  }

  public String getCarClass() {
    return carClass;
  }

  public String getMass() {
    return mass;
  }
}
