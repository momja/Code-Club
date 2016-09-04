// Max Omdal
// Code Club 2016

import java.util.Arrays;

public class BinarySearch {
  public static int value = 111;
  public static int answer = -1;
  public static int[] elements = {10,13,111,607,880};
  public static int lower = 0;
  public static int upper = elements.length;

  public static void main(String[] args) {
    while(answer == -1) {
      int pos = (upper + lower)/2;
      if (value < elements[pos]) {
        System.out.println(pos);
        System.out.println(Arrays.toString(elements));
        upper = pos;
      }
      else if (value > elements[pos]) {
        System.out.println(pos);
        System.out.println(Arrays.toString(elements));
        lower = pos;
      }
      else {
        answer = pos;
        System.out.println("The Binary Search returned the location of value " + value + " at index " + answer);
      }
    }
  }
}
