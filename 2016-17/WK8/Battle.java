
class Battle {
  public Battle(Creature a, Creature b) {
    Terrain terrain = pickTerrain();
    if (a.habitat = terrain.string) {
      System.out.println(a.name + " has the advantage!");
    }
    else {
      System.out.println(b.name + " has the advantage!");
    }
    a.calculateHealth(terrain);
    b.calculateHealth(terrain);
    while (a.health > 0 && b.health > 0) {
      double chooseStarter = Math.random();
      if (chooseStarter < 0.5) {
        System.out.println(a.name + " attacks!");
        b.health -= a.calculateAttack();
      }
      else {
        System.out.println(b.name + " attacks!");
        a.health -= b.calculateAttack();
      }
    }
  }

  Terrain pickTerrain() {
    double random = Math.random();
    if (random < 0.333) {
      return new Terrain("Air");
    }
    else if (random < 0.666) {
      return new Terrain("Water");
    }
    else {
      return new Terrain("Land");
    }
  }
}
