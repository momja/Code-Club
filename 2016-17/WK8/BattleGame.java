public class BattleGame {
  public static void main(String[] args) {
    Creature a = new Kangaroo();
    Creature b = new Human();
    Battle battle = new Battle(a, b);
  }
}

// Max Omdal
// Code Club 2017

class Kangaroo extends Creature {
  public Kangaroo() {
    name = "Joey";
    gender = "Male";
    weight = 150.0; // in pounds
    habitat = "land";
    attack = 55;
    defense = 15;
    health = 30;
  }
}

class Human extends Creature {
  public Human() {
    name = "Maxwell";
    gender = "Male";
    weight = 150.0;
    habitat = "land";
    attack = 20;
    defense = 33;
    health = 47;
  }
}
