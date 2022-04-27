package Lesson8.ClassTasks.Task1;

public class Books implements Printable {

  protected String [] books;

  public Books() {

  }

  public Books(String[] books) {
    this.books = books;
  }

  public String[] getBooks() {
    return books;
  }

  public void setBooks(String[] books) {
    this.books = books;
  }

  @Override
  public String print() {
    System.out.println("Print books");

    return null;
  }
}
