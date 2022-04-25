package Lesson7.classWork;

public class TempConverter {
  private int tempK = 0;
  private int tempF = 0;

  public void TempConverter(int tempK, int tempF) {
    this.tempK = tempK;
    this.tempF = tempF;
  }

  @Override
  public String toString() {
    return super.toString();
  }

  public int getTempK() {

    return tempK;
  }

  public void setTempK(int tempK) {
    this.tempK = tempK;
  }
}
