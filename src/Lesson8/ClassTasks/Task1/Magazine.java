package Lesson8.ClassTasks.Task1;

public class Magazine implements Printable {
  protected String[] magazines;

  public Magazine() {
  }


  public Magazine(String[] magazines) {
    this.magazines = magazines;

  }

  public String[] getMagazines() {
    return magazines;
  }

  public void setMagazines(String[] magazines) {
    this.magazines = magazines;
  }

  @Override
  public String print() {
    System.out.println("Print magazines");

    return null;
  }
}
