###### Max Omdal
###### Code Club

# Objects, Classes, and Methods
**Object** - an entity that you can manipulate in your program
**Methods** - a method consists of a sequence of instructions that can be called on an Object
**Classes** - specifies the methods you can apply to an object

```java
// the class is llama
class llama {
  // name is a variable given to all instances of llama class
  static String name = "joe the llama mama";
  // giveName is a method
  static String giveName() {
    System.out.println(name);
  }
}

public class southAmerica {
  public static void main(String[] args) {
    // coolAnimal is an object with class llama
    llama coolAnimal = new llama();
    llama.giveName();
    llama.name = "joe the llama papa";
    llama.giveName();
  }
}
```

[Article](https://www.tutorialspoint.com/java/java_object_classes.htm)

[Video](https://youtu.be/4xKihjI6HJ0)
