import java.util.Arrays;

public class descinsertionsort {
    public static void main(String[] args) {
        int[] a = {9, 7, 8, 5, 6, 4, 6, 3, 5, 6, 2, 4};

        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            int i = j - 1;
            while (i >= 0 && a[i] < key) {
                a[i + 1] = a[i];
                i = i - 1;
                a[i + 1] = key;
            }
        }
        System.out.println(Arrays.toString(a));

    }

}
