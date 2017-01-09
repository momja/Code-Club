// Max Omdal
// 2017

// Inheritance

public class MainClass {
  public static void main(String[] args) {
    Reptile monty = new Reptile();
    monty.move();
    
    Dinosaur dionisio = new Dinosaur();
    dionisio.move();
    dionisio.roar();
    
    KomodoDragon smaug = new KomodoDragon();
    smaug.move();
    smaug.breatheFire();
  }
}

class Reptile {
  void move() {
    System.out.println("Creature moves around");
  }
}

class Dinosaur extends Reptile {
  void roar() {
    System.out.println("The dinosaur roars loudly!");
  }
}

class KomodoDragon extends Reptile {
  void breatheFire() {
    System.out.println("Wait, Kimodo dragons can't breathe fire!");
  }
}
