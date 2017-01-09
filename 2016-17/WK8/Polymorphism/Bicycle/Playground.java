
public class Playground {
  public static void main(String[] args) {
    // Create two different
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        MountainBike bike2 = new MountainBike();
        Bicycle bike3 = new MountainBike();

        System.out.println(bike3.treadWidth);
        // Invoke methods on
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.changeTreadWidth(5);
        bike2.printStates();

  }
}

class Bicycle {

  int cadence = 0;
  int speed = 0;
  int gear = 1;
  void changeCadence(int newValue) {
    cadence = newValue;
  }

  void changeGear(int newValue) {
    gear = newValue;
  }

  void speedUp(int increment) {
    speed = speed + increment;
  }

  void applyBrakes(int decrement) {
    speed = speed - decrement;
  }

  void printStates() {
    System.out.println("cadence: " + cadence +
      " speed: " + speed +
      " gear: " + gear);
  }
}

class MountainBike extends Bicycle {
  int treadWidth = 10;

  void changeTreadWidth(int newValue) {
    treadWidth = newValue;
  }

  // printStates() is an example of polymorphism.
  // an instance of MountainBike with reference to MountainBike will run this
  // printStates() function in the bicycle class is then ignored
  void printStates() {
    System.out.println("cadence: " + cadence +
      " speed: " + speed +
      " gear: " + gear + " tire tread: " + treadWidth);
  }
}
