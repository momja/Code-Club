class Terrain {
  String string;
  String weakestIn;

  public Terrain(String terrain) {
    if (terrain == "air") {
      weakestIn = "water";
    }
    else if (terrain == "water") {
      weakestIn = "air";
    }
    else {
      weakestIn = "water";
    }
  }
}
