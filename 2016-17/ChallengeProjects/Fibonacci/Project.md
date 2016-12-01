###### Max Omdal ######
###### Code Club 2016 ######

## Fibonacci Sequence Project ##
##### The fibonacci sequence is a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. #####

  For Example:
  - the beginning of the sequence looks like so: 0, 1, 1, 2, 3, 5, 8

  Think about this for a second:
  - given that the first two digits are always 0, 1, the second digit must be one because 0 + 1 = 1
  - if the first two digits are one, then the third digit is the sum of those two digits
  - 1 + 1 = 2
  - now we have the sequence 1, 1, 2
  - if we continue, adding the two digits at the end of the sequence, we will have:
    - 1 + 2 = 3
  - now we have 1, 1, 2, 3
  - this can continue forever

The fibonacci sequence can be summed up simply as the equation y<sub>n</sub> = y<sub>n-1</sub> + y<sub>n-2</sub>

## Goal: ##
#### Create a program that prints the first 20 numbers in the fibonacci sequence without explicitly printing each number ####

### Requirements ###
- Must be written in Java
- Uses System.out.println() to print to console
- prints the first 20 digits of fibonacci
- cannot be copy-paste code, make it your own work!

##### Bonus Requirements #####
  - Modify where the sequence can be started
    - for example, give a sequence starting at 13 (13, 21, 34, 55, 89)

### Hints ###
- A function can call itself (this is called recursion, do some research on it!)
- Remember the equation: y<sub>n</sub> = y<sub>n-1</sub> + y<sub>n-2</sub>
- As long as the code fulfills the requirements, you succeded! Start with this template if you like:

```java

    class Fibonacci {
      public static int sizeOfSequence = 20;

      public static void main(String[] args) {

        for (int i = 0; i < sizeOfSequence; i++) {
          // print something here
        }
      }

      public static int getFib(int n) {
        // get a number at position n in the sequence here
      }

    }

```
