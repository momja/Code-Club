public class southAmerica {
  public static void main(String[] args) {
    // coolAnimal is an object with class llama
    llama coolAnimal = new llama();
    llama.giveName();
    llama.giveGender();
    llama.name = "joe the llama papa";
    llama.gender = "male";
    llama.giveName();
    llama.giveGender();
    unicorn.giveName();
    unicorn.giveGender();

  }
}

// the class is llama
class llama {
  // name is a variable given to all instances of llama class
  static String name = "joe the llama mama";
  static String gender = "female";
  // giveName is a method
  static void giveName() {
    System.out.println(name);
  }
  static void giveGender() {
    System.out.println(gender);
  }
}

class unicorn {
  static String name = "al";
  static String gender = "male";
  static void giveName() {
    System.out.println(name);
  }
  static void giveGender() {
    System.out.println(gender);
  }
}
