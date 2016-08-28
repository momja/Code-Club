// Max Omdal
// Code Club 2016

public class GroceryList2 {
  public static String[] list = new String[]{"Nuts", "Bananas", "Ramen", "Gouda", "Milk"};
  public static void main(String[] args) {
    System.out.println("Grocery List:");
    for(int i = 0; i < list.length; i++) {
      System.out.println("~ " + list[i]);
    }
  }
}
