
public class FunSun {
  public static void main(String[] args) {
    Kid son = new Kid("male", "John");
    Kid daughter = new Kid("female", "Suzie");
    Adult mother = new Adult("female", "Kathy");
    Adult father = new Adult("male", "Richard");

    son.swim();
    father.yell();
    mother.yell();
  }
}

class Person {
  public String name;
  public String gender;
  public Person(String gender, String name) {
    this.name = name;
    this.gender = gender;
  }

  public void swim() {
    System.out.println(name + " went swimming");
  }
}

class Adult extends Person {
  public String name;
  public String gender;
  public Adult(String gender, String name) {
    super(gender, name);
    this.name = name;
    this.gender = gender;
    System.out.println("Adult loading...");
  }

  public void yell() {
    if (gender == "male")
      System.out.println(name + " yells at his kids");
    if (gender == "female")
      System.out.println(name + " yells at her kids");
  }
}

class Kid extends Person {
  public String name;
  public String gender;
  public Kid(String gender, String name) {
    super(gender, name);
    this.name = name;
    this.gender = gender;
    System.out.println("Kid loading...");
  }
}
