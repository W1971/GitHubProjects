package Lesson6.HomeWork.HomeTask2;


  public class Computer1 {
    protected int frequency;
    protected int coresCount;
    protected String ramName;
    protected int ramSize;
    protected String hddType;
    protected int hddSize;
    protected String hddName;

    public Computer1(int frequency, int coresCount, String ramName,int ramSize,String hddType,int hddSize,String hddName) {
      this.frequency = frequency;
      this.coresCount = coresCount;
      this.ramName = ramName;
      this.ramSize = ramSize;
      this.hddType = hddType;
      this.hddSize = hddSize;
      this.hddName = hddName;
    }

    public double price() {
      return (frequency * coresCount / 100.0 + ramSize / 80.0 + hddSize / 20.0);
    }

    public boolean isSuitableForUse() {
      if ((frequency >= 2000) && (coresCount >= 8) && (ramSize >= 2048) &&( hddType!= "HDD") && (hddSize >= 320))
        return true;
      else
        return false;
    }

    public String info() {
      return "Computer:\n" +
              "  frequency: " + frequency + " MHz\n" +
              "  cores: " + coresCount + "\n" +
              "  RAM: "  + ramName +"\n" +
              "  RAM: " + ramSize + " MB\n" +
              "  HDD: " + hddType + "\n" +
              "  HDD: " + hddSize + " GB\n" +
              "  HDD: " + hddName + " \n" +
              "  price: " + price() + "$\n" +
              (isSuitableForUse() ? "  is suitable for use" : "  is not suitable for use");
    }
  }
