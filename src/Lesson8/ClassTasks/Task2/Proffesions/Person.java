package Lesson8.ClassTasks.Task2.Proffesions;

public class Person extends Driver{
  private String surname;
  private String name;

  public Person(String surname, String name) {
    super();
    this.surname = surname;
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public String getName() {
    return name;
  }
}
