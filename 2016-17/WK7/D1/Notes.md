###### Max Omdal
###### Code Club

**Object** - an entity that you can manipulate in your program
**Methods** - a method consists of a sequence of instructions that can be called on an Object
**Classes** - specifies the methods you can apply to an object

```java
// the class is llama
class llama {
  // name is a variable given to all instances of llama class
  name = "joe the llama mama";
  // giveName is a method
  String giveName() {
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
[Video]()
