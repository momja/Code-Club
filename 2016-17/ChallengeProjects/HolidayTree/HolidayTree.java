// Max Omdal
// Code Club 2016

public class HolidayTree {
  public static void main(String[] args) {
    top(1);
    trunk();
  }

  public static void top(int start) {
    for (double y = start; y <= start + 3; y++) {
      double x = 2*(y - 0.5);
      for (int i = 0; i < (6 - y); i++) {
        System.out.print("  ");
      }
      for (int i = 0; i < x; i++) {
        System.out.print("0 ");
      }
      System.out.println();
    }
    while (start < 3) {
      start = start + 1;
      top(start);
    }
  }

  public static void trunk() {
    for (int i = 0; i < 3; i++) {
      for (int y = 0; y < 8; y++) {
        System.out.print(" ");
      }
      System.out.println("0 0 0");
    }
  }
}
