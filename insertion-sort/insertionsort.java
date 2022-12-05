import java.util.Arrays;

public class insertionsort {
  public static void main(String[] args) {
    int[] array = {9, 6, 8, 7, 4, 5, 3, 4, 2, 1, 4, 3};

    for (int j = 1; j < array.length; j++) {
      int key = array[j];
      int i = j - 1;
      while (i >= 0 && array[i] > key) {
        array[i + 1] = array[i];
        j = j - 1;
        array[j + 1] = key;
      }
    }
    System.out.println(Arrays.toString(array));
  }
}
