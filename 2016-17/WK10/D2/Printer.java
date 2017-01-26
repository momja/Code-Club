// Max Omdal
// Code Club 2016

public class Printer {
  public static void main(String[] args) {
    printFunction(10, "Maxwell");
  }

  static void printFunction(int times, String name) {
    for (int i = 0; i < times; i++) {
      System.out.println("Hello " + name);
    }
  }
}
