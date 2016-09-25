### Chapter 3 Input And output

**3.1 The System class**

System - a class that provides methods related to the system/environment
Package - a collection of related classes
  - java.io is a package
- System.out is a PrintStream
- *System.out.println(System.out)* prints the address of System.out as a hexadecimal
Library - collection of classes

**3.2 The Scanner class**

- scanner class makes it easy to input words and numbers
  - found is java.util
- System.in is an InputStream

**3.3 Program structure**

Hierarchy of organizational units:
  - Package
    - Class
      - Method
        - Statement
          - Expression
            - Token
Tokens - the basic elements of a program, such as numbers, identifiers, keywords, parentheses and operators

**3.4 Inches to centimeters**

```java
int inch;
double cm;
final double CM_PER_INCH = 2.54
Scanner in = new Scanner(System.in);
System.out.print("How many inches? ");
inch = in.nextInt();
cm = inch * CM_PER_INCH;
System.out.print(inch + " in = ");
System.out.println(cm + " cm");

```

**3.5 Literals and constants**

- a variable declared as final is a constant, and cannot be changed
  - constant variable names are all upercase with underscores between words

**3.6 Formatting output**

- *printf* is a method in System.out that can format print statements
```java
System.out.printf("Four thirds = %.3f", 4.0 / 3.0);
```
Format Specifier - A special sequence that starts with a percent sign
  - %.3f indicates to display the first three decimals of a floating-point number
  - %d is integers (d for decimal)

**3.8 Modulus operator**

Modulus - (%) remainder of integer division
- 10 % 7 = 3

**3.10 The Scanner Bug**

- Scanner object reads everything as a stream, so if you ask for an int, then a string, it will cut you off after the int is given
- must add an extra nextLine after nextInt

```java
System.out.print("What is your age?");
age = in.nextInt();
in.nextLine(); // read the newline
System.out.print("What is your name?");
name = in.nextLine();
System.out.printf("Hello %s, age %d\n");
```
