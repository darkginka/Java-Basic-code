class Vehicle {
  protected String brand = "Ferari";
  public void hon() {
    System.out.println("piii");
  }
}
public class Inher extends Vehicle {
  public String modelName = "x20";

  public static void main(String[] args) {
    Inher myCar = new Inher();
    myCar.hon();
    System.out.println(myCar.brand + myCar.modelName);
  }
}


