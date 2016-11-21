// Max Omdal
// Code Club 2016

// Richard the human is trying to figure out how much food he needs to feed his family at thanksgiving
// If each person eats 2 pounds of food, how much food will Richard need?
// If Richard needs less than 10 pounds, print "Richard needs a little bit of food."
// If Richard needs less than 20 pounds, print "Richard needs quite a bit of food."
// If Richard needs more than 20 pounds, print "Richard needs a lot of food!"
public class ThanksgivingFun {
  public static void main(String[] args) {
    int numberOfPeople = 10;
    int poundsOfFood = numberOfPeople * 2;
    System.out.println("Richard needs " + poundsOfFood + " pounds of food.");

    if (poundsOfFood == 0) {
      System.out.println("Richard needs a little bit of food.");
    }
    else if (poundsOfFood <= 20) {
      System.out.println("Richard needs quite a bit of food.");
    }
    else {
      System.out.println("Richard needs a lot of food!");
    }

  }
}
