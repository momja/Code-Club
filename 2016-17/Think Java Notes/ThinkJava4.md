### Chapter 4 Void methods

**4.1 Math methods**

Argument - expression in parentheses (input of a function)
- **Math** class provides mathematical operations.
  - class is imported by default
```java
double root = Math.sqrt(17.0);
double angle = 1.5;
double height = Math.sin(angle);
//trigonometry functions are in radians
```
- trig functions are in radians
- **MATH.PI** is constant for pi (3.14159)
- **MATH.E** is euler's constant
```java
double radians = Math.toRadians(180.0);
double degrees = Math.toDegrees(Math.PI);
```
- the largest value an int can hold is 2^31 - 1
- the largest value a long can hold is 2^63 - 1

**4.2 Composition revisited**

```java
double x = Math.pow(10.0, 2);
//Math.pow() takes two arguments (base, power)
//x is assigned value 10^2 = 100
```

**4.3 Adding new methods**

- you can use methods from the java library, but you can also make your own methods:
```java
public class NewLine {

  public static void newLine() {
    System.out.println();
  }

  public static void main(String[] args) {
    System.out.println("First line. ");
    newLine();
    System.out.println("Second line. ");
  }
}
```
