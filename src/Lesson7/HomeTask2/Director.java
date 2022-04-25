package Lesson7.HomeTask2;

public class Director implements JobDescription,JobDescription2,Jobdescrition3 {



  @Override
  public void managme() {
    System.out.println("Manage company");

  }

  @Override
  public void doAccounting() {
    System.out.println("Verifying accounting department ");

  }

  @Override
  public void doingSomeJob() {
    System.out.println("Building the good team");

  }
}
