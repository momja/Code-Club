###### Max Omdal ######
###### Code Club 2016 ######

## Fido The Coding Dog Wants to sort his bones by size!

![Coding Dog](puppy-coding.jpg "coding puppy")

Help Fido sort his bones! He has created an array with the sizes of his bones, but he isn't sure if they are in order. Write a program to make sure they are in order from smallest to largest.

### Requirements ###
Given an array of sizes, return true if each size is equal or greater than the one before. The array will be length 2 or more.
Must work for following sample Arrays:
- {1,2,1}
- {0,5,5}
- {-5,10,11}
- {1,2,-5}
- {-1,0,10,1000}

### Hints ###
Start with this, and finish scoresIncreasing() function:
```java
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
    //do figuring here
  }

}
```
