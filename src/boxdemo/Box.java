package boxdemo;

public class Box {
  // Instance variables
  private String color;
  private int numSides;

  // Constructor
  public Box(String color, int numSides) {
    this.color = color;
    this.numSides = numSides;
  }

  // "getter"
  public String getColor() {
    return color; // Instance variable value
  }

  // "setter"
  public void setColor(String color) {
    this.color = color;
  }

}
