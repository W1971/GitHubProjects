/*2. Создать классы "Директор", "Рабочий", "Бухгалтер".
Реализовать интерфейс с методом, который печатает название
должности и имплементировать этот метод в созданные классы.
*/

package Lesson7.HomeTask2;

public class Main {
  public static void main(String[] args) {
    Director director = new Director();
    director.managme();
    director.doAccounting();
    director.doingSomeJob();

    System.out.println("****************");

    Accounter accounter = new Accounter();
    accounter.doAccounting();

    System.out.println("*****************");

    Worker worker = new Worker();
    worker.doingSomeJob();

  }

  }

