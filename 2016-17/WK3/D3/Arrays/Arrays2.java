// Max Omdal
// Code Club 2016

public class Arrays2 {
  public static void main(String[] args) {
    // String[] creates an array
    String[] groceryList = {"banana", "oatmeal", "eggs", "sausage", "potatoes"};
    // Loops through all the items in the grocerylist
    for (String food: groceryList) {
      // variable food is equal to an item on the groceryList
      System.out.println("item: " + food);
      if (food == "eggs") {
        System.out.println("be careful with the eggs!");
      }
    }
  }
}
