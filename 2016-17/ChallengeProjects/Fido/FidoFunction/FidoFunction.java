// Code Club
// Max Omdal

public class FidoFunction {
  public static void main(String[] args) {
    int gramsOfChocolate = 80593;
    int x = calculateBones(gramsOfChocolate);
    System.out.println(gramsOfChocolate + " grams of chocolate makes " + x + " chocolate bone treats");
  }

  public static int calculateBones(int grams) {
    return(grams/117);
  }
}
