public class southAmerica {
  public static void main(String[] args) {
    // coolAnimal is an object with class llama
    llama coolAnimal = new llama();
    llama.giveName();
    llama.name = "joe the llama papa";
    llama.giveName();
  }
}

// the class is llama
class llama {
  // name is a variable given to all instances of llama class
  static String name = "joe the llama mama";
  // giveName is a method
  static void giveName() {
    System.out.println(name);
  }
}
