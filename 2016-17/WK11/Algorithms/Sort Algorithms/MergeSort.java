// Max Omdal
// Code Club 2016

class MergeSort {
  public static void main(String[] args) {

  }

  public int[] sort(int[] unsortedArray) {
    int[] sortedArray = new int[unsortedArray.length];
    int maxNumber = unsortedArray[0];
    for (int number: unsortedArray) {
      if (number >= maxNumber) {
        maxNumber = number;
        //TODO: append number to sortedArray
      }
      else {
        
      }
    }
    return sortedArray;
  }
}
