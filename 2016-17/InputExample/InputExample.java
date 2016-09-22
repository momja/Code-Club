// Max Omdal
// Code Club 2016

import java.util.Scanner;

class InputExample {
  public static void main(String[] args) {
    String line;
    //create scanner variable and feed input from System.in
    Scanner in = new Scanner(System.in);
    System.out.println("Type Something: ");
    line = in.nextLine();
    System.out.println("You said: " + line);
    in.close();
  }
}
