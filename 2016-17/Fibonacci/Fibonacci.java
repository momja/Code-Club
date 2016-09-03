// Max Omdal
// Code Club 2016

class Fibonacci {
  public static int sizeOfSequence = 20;

  // main function will doesn't need to be called, it runs on its own
  public static void main(String[] args) {
    // get the fibonacci number for each number in the sequence and print it
    for (int i = 0; i < sizeOfSequence; i++) {
      System.out.println(getFib(i));
    }
  }

  public static int getFib(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    else {
      return getFib(n - 1) + getFib(n - 2);
    }
  }

}
