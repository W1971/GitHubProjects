package Lesson6.classWork;

public class TicketBooking {
   private String passName;
  private int passAge;
  private String passBerth;

  public TicketBooking() {
    this("Arun",45);
  }
  public TicketBooking(String name, int age) {
    this(name,age,"Lower berth");
  }
  public TicketBooking(String name,int age,String berth) {
    this.passName = name;
    this.passAge = age;
    this.passBerth = berth;

  }
  void displayTicket() {
    System.out.println("Passenger Name:" + passName);
    System.out.println("Passenger Age: " + passAge);
    System.out.println("Passenger Berth: " + passBerth);
  }
  public static void main(String[] args) {
    TicketBooking tb = new TicketBooking();
    tb.displayTicket();
  }
}
