// Max Omdal
// Code Club 2016

class Operators {
  public static void main(String[] args) {
    int x = 10;
    int y = x % 3;
    // 10/3 = 9 with remainder 1
    System.out.println("10 % 3 = " + y);

    int z = 7;
    // ++z or z++ increments z by one
    System.out.println("7 + 1 = " + ++z);

    int w = 12;
    int i = 3;
    w += i;
    // 12 + 3 = 15
    System.out.println("12 += 3 = " + w);
  }
}
