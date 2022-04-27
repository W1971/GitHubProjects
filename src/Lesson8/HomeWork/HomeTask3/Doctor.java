package Lesson8.HomeWork.HomeTask3;

  public class Doctor {
  protected String occupation;
  protected boolean faceSurgeon;
  protected String name;
  protected int fee;



  public Doctor(String occupation, String name, int fee) {
    this.occupation = occupation;
    this.name = name;
    this.fee = fee;
  }


  @Override
  public String toString() {
    return "Occupation :" +occupation +"\n" + "Name : " +name +" \n"+"Visit fee :" + fee+ "\n";
  }

  public void  curing(){
    System.out.println("Doctor usually is curring");
  }

  public String getOccupation() {
    return occupation;
  }

  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }

  public boolean isFaceSurgeon() {
    return faceSurgeon;
  }

  public void setFaceSurgeon(boolean faceSurgeon) {
    this.faceSurgeon = faceSurgeon;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getFee() {
    return fee;
  }

  public void setFee(int fee) {
    this.fee = fee;
  }
}
