// Max Omdal
// Code Club 2016

public class ZeroGridRandom {
  public static void main(String[] args) {
    for (int y = 0; y < 10; y++) {
      for (int x = 0; x < 10; x++) {
        double random = Math.random();
        if (random < 0.5) {
          System.out.print("x");
        }
        else {
          System.out.print("y");
        }
      }
      System.out.println();
    }
  }
}
