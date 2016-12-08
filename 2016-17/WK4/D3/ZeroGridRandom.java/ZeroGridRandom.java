// Max Omdal
// Code Club 2016

public class ZeroGridRandom {
  public static void main(String[] args) {
    for (int y = 0; y < 5; y++) {
      System.out.println();
      for (int x = 0; x < 10; x++) {
        double random = Math.random(); //gives us a random number between 0 and 1
        if (random <= 0.5) {
          System.out.print("0");
        }
        else {
          System.out.print("1");
        }
      }
    }
  }
}
