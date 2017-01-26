# Fido is making a function!

## Help Fido the coding dog create a group of functions with different helpful utilities!

### Copy and paste the code below to get started:

```java
public class FidoFunction {
  int numberOFBones = 10;
  String dogName = "Fido";
  String barkSound = "Woof!";
  double weight = 27.5; // in pounds

  public static void main(String[] args) {
    eatBone();
    System.out.println(numberOFBones);
    barkThreeTimes();
    changeDogName("Roofus");
    System.out.println(weightToMass());
  }

  static void eatBone() {
    // Code here
  }

  static void barkThreeTimes() {
    // Code here
  }

  static void changeDogName(String newName) {
    // Code here
  }

  static double weightToMass() {
    // Code here
  }
}
```

Functions to make:

  - eatBone
    - (subtract one from the variable numberOfBones)
  - barkThreeTimes
    - (use a for loop to print barkSound three times)
  - changeDogName
    - (change String variable dogName to new name, using a parameter)
  - weightToMass
    - (convert the weight of the dog, in pounds, to the mass, in Kg)
    - Must use a return statement and return the value of the mass
    - 1 kg = 2.2046 lbs
