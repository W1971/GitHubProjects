package Lesson6.classWork;


  public class Vector {
    public void setX(double x) {
      this.x = x;
    }

    public void setY(double y) {
      this.y = y;
    }

    public void setZ(double z) {
      this.z = z;
    }

    private double x;
    private double y;
    private double z;

    public Vector(double a, double b, double c) {
      x = a;
      y = b;
      z = c;
    }

    public double getX() {
      return x;
    }

    public double getY() {
      return y;
    }

    public double getZ() {
      return z;
    }

    public double length(Vector vector) {
      return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector add(Vector other) {
      return new Vector(this.x + other.x, this.y + other.y, this.z + other.z);
    }
  }