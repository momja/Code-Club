###### Max Omdal ######
###### Code Club 2016 ######

## Control Structures ##

Control structures allow parts of a program to run in a non-sequential order.

### Decision-Making Control Structures ###

- These include if, if...else, and switch statements
  - #### if statement: 'if x is true, then do this'

  ```java
  if (variable == true) {
    // run this code
  }
  ```

  - #### if...else statement: "if x is true, then do this, otherwise do that"

  ```java
  if (variable == true) {
    // run this code
  }

  else {
    // run this code
  }
  ```

  - #### extended if statement:

  ```java
  if (variable == 1) {
    // run this code
  }

  else if (variable == 2) {
    // run this code
  }

  else {
    // run this code
  }
  ```

  - #### switch statement:

  ```java
  switch(variable) {
    case 1: // run this code
          break;
    case 2: // run this code
          break;
    case 3: // run this code
          break;
    default:
  }
  ```


### Iterative Control Structures ###

- Iteration is when the computer repeats the execution of the same code

  - #### The *For* Loop

  ```java
  for (int i = 0; i < 10; i++) {
    // run this code 10 times
  }
  ```

  - #### The *For-Each* Loop

  ```java
  int[] numbers = {1,2,3,4,5,6};
  for(int x: numbers) {
    System.out.println(x);
  }
  ```

  - #### The *While* Loop

  ```java
  int x = 10;
  while (x < 10) {
    //run this code until x is greater than or equal to 10
    x = x + 1;
  }
  ```

### Errors And Exceptions ###

- Exception: an error condition that occurs during the execution of a java program (Dividing an integer by zero will throw an ArithmeticException error)
