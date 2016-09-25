### Chapter 2 Variables And Operators

**2.1 Declaring variables**

Variable - a named location that stores a value
Value - can be a number, text, images, sounds, and other data types
- values must be stored as variables
-variables are declared with a name and type

```java
String message;
```
- here a new variable named message is declared with type String
- variables are case-sensitive
- some words like *public, class, static* cannot be used as variable names because they are reserved

**2.2 Assignment**

- variables must be assigned a value (initialized) before being used

**2.3 State diagrams**

- the use of an equals statement is an assignment, not a statement of equality
  - if you type *a = 7* that is not the same as *7 = a*
- variables can change values

**2.4 Printing variables**

- variables can be printed by using the variable name (identifier) in the print statement:
```java
String firstLine = "Hello, again!";
System.out.println(firstLine);
// prints "Hello, again!"
```
Using variable names also works with other types, such as integers:

```java
int score = 10;
System.out.print("the current score is ");
System.out.println(firstLine);
// prints "the current score is 10"
```

**2.5 Arithmetic operators**

Operators - symbols that represent simple computations
- check operators folder for full list of operators
Operands - the values operators work with

**2.6 Floating-point numbers**

Floating Point Numbers - Can represent fractions as well as integers

```java
double pi;
pi = 3.14159;
```

- an integer divided by an integer will always be rounded to an integer
- but a double divided by a double gives us a double

**2.7 Rounding errors**

Rounding error - the difference between the number we want and the floating-point number we get

**2.8 Operators for strings**

Concatenation - joining of two strings together
- use + symbol to join strings together
```java
System.out.println("Hello, " + "Code Club!");
//prints "Hello, Code Club!"
```
Order of operations - PEMDAS

**2.10 Types of errors**

Compile-Time Errors - occur when you violate the syntax rules of the java language.
Parsing - Reading a program before translating
  - Forgetting to add } can lead to *reached end of file while parsing* errors
Run-Time Errors - occur while the interpreter is executing byte code and something goes wrong
  - also called exceptions
  - the line where the error occurs is not always the source of the problem
Logic Error - When the code runs without generating errors, but the output is not what you wanted
