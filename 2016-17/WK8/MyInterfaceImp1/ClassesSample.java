
public class MainClass {
  public static void main(String[] args) {
    ID max = new ID();
    max.eyeColor = "BLU";
    max.height = 1.8;
    max.weight = 150;
    max.donor = true;
    max.state = "MN";
    
    max.setAge(16);
    System.out.println(max.getAge());
  }
}

class ID {
  String eyeColor;
  double height; // in meters
  int weight;
  int age;
  boolean donor;
  String state;
  
  int getAge() {
    return age;
  }
  
  void setAge(int newAge) {
    age = newAge;
  }
}

