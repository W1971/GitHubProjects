package Lesson8.ClassTasks.task2.Vihcels;

abstract public class Car {
  int speed;
  abstract   void run();
  void stop(){
    speed = 0;
  }


  public static  class Toyota extends Car{

    @Override
    static void run() {
      speed= 245;
      return;

    }

  }

  public static void main(String[] args) {
 Car  toyota = new Toyota();
 Toyota.run();
  }
}
