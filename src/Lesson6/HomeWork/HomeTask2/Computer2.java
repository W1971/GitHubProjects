package Lesson6.HomeWork.HomeTask2;

public class Computer2 extends Computer1 {
  private int batteryCapacity;

  public Computer2(int frequency, int coresCount, String ramName, int ramSize, String hddType,  int hddSize, String hddName, int batteryCapacity) {
    super(frequency, coresCount, ramName, ramSize,hddType, hddSize, hddName);
    this.batteryCapacity = batteryCapacity;
  }



  @Override
  public double price() {
    return (super.price() + batteryCapacity/ 10.0);
  }

  @Override
  public boolean isSuitableForUse() {
    return (super.isSuitableForUse() && (batteryCapacity >= 60));
  }

  @Override
  public String info() {
    return "Laptop:\n" +
            "  frequency: " + frequency + " MHz\n" +
            "  cores: " + coresCount + "\n" +
            "  RAM: "  + ramName +"\n" +
            "  RAM: " + ramSize + " MB\n" +
            "  HDD: " + hddSize + " GB\n" +
            "  HDD: " + hddName + " \n" +
            "  price: " + price() + "$\n" +
            "  battery capacity: " + batteryCapacity + " min\n" +
            (isSuitableForUse() ? "  is suitable for use" : "  is not suitable for use");
  }
}