// Max Omdal
// Code Club 2016

public class Staircase {
  public static void main(String[] args) {
    int n = 10;
    for (int i = 1; i <= n; i++) {
      for (int x = 1; x <= n; x++) {
        if ((i+x)>n) {
          System.out.print(0);
        }
      }
      System.out.println();
    }
  }
}
