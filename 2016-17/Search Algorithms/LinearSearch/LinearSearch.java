// Max Omdal
// Code Club 2016

// Linear search algorithm walks through a sorted list, comparing every item to its key.
// Once you reach a number greater than the key in the data set,
// you can determine, the key is not in the ordered data set.
class LinearSearch {

  // Creates some sample data to test
  // Notice how the data is ordered in ascending order
  public static int[] data = {1, 10, 21, 35, 99, 1000, 18039};
  // Counts the number of elements in the data array
  public static int size = data.length;

  // Main function always runs by default
  public static void main(String[] args) {
    // Key is the value we are searching for in the data set
    int key = 99;
    if (linearSearch(key) != -1) {
      System.out.println("Found key at index " + linearSearch(1));
    }
    else {
      System.out.println("Key not included in the data set");
    }
  }

  public static int linearSearch(int key) {
    // index starts at 0, because the first element in an array has an index of 0
    int index = 0;
    while(index < size) {
      if(data[index] == key) {
        // Found the key in the dataset! Return its location quickly!
        return index;
      }
      if(data[index] > key) {
        // If the key cannot be found in the dataset, return -1
        return -1;
      }
      //run through while loop again, incrementing index by 1
      index++; // ++ is an increment operator. check the Operators folder in Types and Identifiers
    }
    // If the key cannot be found in the dataset, return -1
    return -1;
  }
}
