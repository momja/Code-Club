public class Challenge {
  public static void main(String[] args) {
    int x = 5;
    System.out.println(x);
    if (x < 3) {
      System.out.println("less than three");
    }
    else if (x == 3) {
      System.out.println("that's the magic number");
    }
    else {
      System.out.println("greater than three");
    }
    x = 3;
    int y = (x * 2);
    String[] A = {"0","a","b","c","d","e","f"};
    while (y > 0) {
      System.out.println("Yay, loops " + A[y]);
      y--;
    }
  }
}
