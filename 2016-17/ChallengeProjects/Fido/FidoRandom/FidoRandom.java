// Max Omdal
// Code Club 2016

public class FidoLoop {
  public static void main(String[] args) {
    int count = 1;
    while (count <= 100) {
      System.out.println(count);
      count = count + 1;
    }
    System.out.println("Ready or not, here I come!!!");
    int x = 10;
    int y = 100;
    int number = (int) (Math.random()*x) +y;
    int random = number % 2;
    if (random == 0) {
      System.out.println("I found them");
    }
    else {
      System.out.println("I couldn't find them:(");
    }
  }
}
