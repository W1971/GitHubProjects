package Lesson8.HomeWork.HomeTask3;

public class Surgery extends Doctor {

  private String surgeon;

  public String getSurgeon() {
    return surgeon;
  }

  @Override
  public void curing() {
    while ((isFaceSurgeon()))
      System.out.println("Visit face surgeon");
  }

  public Surgery(String occupation, String name, int fee) {
    super(occupation, name, fee);

  }
}
