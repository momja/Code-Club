### Chapter 1

**1.1 What is programming?**

Program - a sequence of instructions that specifies how to perform a computation

**1.2 What is computer science?**

Computer Science - the science of algorithms, including their discovery and analysis
Algorithm - a sequence of steps that specifies how to solve a problem
Bugs - programming errors

**1.3 Programming languages**

High-level language - (Python, Java, C, Javascript); must be translated into machine language when running
  - easier to program than low-level
  - portable, meaning they can run on different kinds of computers
Low-level language - machine language;

Interpreter - reads a high-level program and executes it. Executes line-by-line
Compiler - reads and translates entire program and then executes it
  - Java is compiled and interpreted
  Byte code - Java compiler generates byte code
    - like machine code it is fast, but it is still portable

Source-Code - high-level program
Object Code/Executable - low-level translated program

**1.4 The hello world program**

- just like any other language, the first thing you learn to say is hello. This program displays "Hello World!"

```java
public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
```

- the program will output: Hello World!
Statement - a line of code that performs a basic operation
- **System.out.println("Hello World** is a print statement
- java is case-sensitive meaning *System* and *SYSTEM* are not the same
Method - a sequence of statements
  - **public static void main(String[] args)** is a method with name main
Class - a collection of methods
  - **public class Hello** is a class with name Hello

**1.5 Displaying strings**

Strings - phrases in quotation marks

**1.6 Escape sequences**

Escape sequence - a sequence of characters that represents a special characters

```java
public class Hello {
  public static void main(String[] args) {
    System.out.print("Hello!\nHow are you doing?\n");
  }
}
```

- This output will be spaced over two lines like so:

```
Hello!
How are you doing?
```

- These are some available escape sequences:

|sequence|character|
|---|---|
|\n|newline|
|\t|tab|
|\"|double quote|
|\\|backslash|

**1.8 Debugging code**

- trial and error is not a good debugging method
- code in increments and change things as you need
- always ask questions when you are stuck!
