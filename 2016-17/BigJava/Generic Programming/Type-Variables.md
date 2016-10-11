# Type Variables

Generic Programming: the creation of programming constructs that can be used with many different types
  - for example, array lists are an example of generic programming
- linked list class can store objects of any type
  - can store a String object, and an int object in the same linked list

```java
public class ArrayList<E> {
  public ArrayList() {
    ...
  }
  public void add(E element) {
    ...
  }
}
```

Type Variable: denotes the element type (above, E is the type variable)

- you must instantiate a generic class with a type:

```java
ArrayList<BankAccount>
ArrayList<int>
```
