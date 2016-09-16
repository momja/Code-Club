// Max Omdal
// Code Club

import java.util.Arrays;

class FidoIncreasing {
  public static void main(String[] args) {

    //False
    int[] scores = {1,2,1};
    System.out.print("scores increasing for ");
    System.out.print(Arrays.toString(scores) + "? ");
    System.out.println(scoresIncreasing(scores));

    //True
    int[] scores1 = {0,5,5};
    System.out.print("scores increasing for ");
    System.out.print(Arrays.toString(scores1) + "? ");
    System.out.println(scoresIncreasing(scores1));

    //True
    int[] scores2 = {-5,10,11};
    System.out.print("scores increasing for ");
    System.out.print(Arrays.toString(scores2) + "? ");
    System.out.println(scoresIncreasing(scores2));

    //False
    int[] scores3 = {1,2,-5};
    System.out.print("scores increasing for ");
    System.out.print(Arrays.toString(scores3) + "? ");
    System.out.println(scoresIncreasing(scores3));

    //True
    int[] scores4 = {-1,0,10,1000};
    System.out.print("scores increasing for ");
    System.out.print(Arrays.toString(scores4) + "? ");
    System.out.println(scoresIncreasing(scores4));
  }

  public static boolean scoresIncreasing(int[] scores) {
    int maxNumber = scores[0];
    for (int number: scores) {
      if (number >= maxNumber) {
        maxNumber = number;
      }
      else {
        return false;
      }
    }
    return true;
  }

}
