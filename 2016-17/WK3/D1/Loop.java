// Max Omdal
// Code Club 2016

public class Loop {
  public static void main(String[] args) {
    int countdown = 10; //declare a integer variable named countdown

    while (countdown > 0) { //While countdown is greater than 0...
      System.out.println("T-minus: " + countdown); //print the value of countdown
      countdown = countdown - 1; //subtract one from countdown
    }

    System.out.println("BLAST OFF!!!!"); //The countdown has ended
  }
}
