class Creature {
  String name;
  String gender;
  double weight; // in pounds
  String habitat;
  int attack;
  int defense;
  int health;
  public Creature() {

  }

  double calculateMultiplier(Terrain terrain) {
    double multiplier;
    if (habitat == terrain.string) {
      multiplier = 1.2;
    }
    else if (terrain.string == weakestIn()) {
      multiplier = 0.8;
    }
    else {
      multiplier = 1.0;
    }

    return multiplier;
  }

  void calculateHealth(Terrain terrain) {
    multiplier = calculateMultiplier(terrain);
    health = health*defense*multiplier;
  }

  double calculateAttack() {
    double random = Math.random()*10;
    return random+attack*(Math.loglp(weight));
  }
}
