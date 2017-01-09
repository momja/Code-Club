public class Vehicle {
  public static void main(String[] args) {
    Plane plane = new Plane();
    System.out.println(plane.airline);
    plane.airline = "Northwest";
    System.out.println(plane.airline);
  }
}

class Car {
  int seats = 5;
  int windows = 8;
  String brand = "Toyota";
}

class Plane {
  int wingSpan = 55;
  int seats = 100;
  String airline = "Delta";
}

class Ship {
  int passengers = 927;
  String[] cargo = {"bananas", "coconuts", "coffee beans", "tobacco"};
  int[] embarkCoordinates = {-14.235, 51.925};
  int[] destinationCoordinates = {44.6497, 93.2427};
}
