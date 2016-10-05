# Relationships Between Classes

How to know when a class should inherit another:
- Use the *Is-A* method:
  - a Deer *is a* Mammal, so Deer could inherit from Mammal class

Aggregation: a class aggregates another class if its objects have objects of the other class
  - need when an object needs to remember another object *between method calls*

```java
// every car is a vehicle, so it inherits from Vehicle
public class Car extends Vehicle {
  // every car has tires, so it agreggates Tire
  private Tire[] tires;
}
```



UML Diagrams are typically used to show relationships between classes:

![UML Diagram](https://www.tutorialspoint.com/uml/images/uml_class_diagram.jpg "Diagram Example")

for more on UML, click [here](https://www.tutorialspoint.com/uml/index.htm)
