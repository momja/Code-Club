// Max Omdal
// Code Club 2016

public class MyInterfaceImp1 {
  public static void main(String[] args) {
    MyInterface myInterface = new MyInt();
    myInterface.sayHello();
  }
}

interface MyInterface {
  public String hello = "Hello";
  public void sayHello();
}

interface MyOtherInterface {
  public String goodbye = "Goodbye";
  public void sayGoodbye();
}

class MyInt implements MyInterface, MyOtherInterface {
  public void sayHello() {
    System.out.println(MyInterface.hello);
  }
  public void sayGoodbye() {
    System.out.println(MyOtherInterface.goodbye);
  }
}

//Interfaces can only be implemented to classes
//They cannot be instantiated themselves
