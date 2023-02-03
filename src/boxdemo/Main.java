package boxdemo;

public class Main {

  public static void main(String[] args) {
    // Instantiate two Box objects
    Box b1 = new Box("Red", 4);
    Box b2 = new Box("Green", 5);

    // Use methods
    System.out.println("B1: " + b1.getColor());
    System.out.println("B2: " + b2.getColor());
    // change the color of b2
    b2.setColor(b1.getColor()); // Set b2's color to that of b1
    System.out.println("B2 new color: " + b1.getColor());

//    String myString = "Zoom is used today!";
//    System.out.println("2 parameters: " + myString.substring(8,18));
//    System.out.println("1 parameter: " + myString.substring(5));


  }
}
