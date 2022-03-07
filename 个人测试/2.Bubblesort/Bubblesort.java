import java.util.*;

public class Bubblesort {
    static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] {12, 33, 42, 2, 6,23, 45};
        Bubblesort.sort(arr);
        System.out.println( Arrays.toString(arr));
    }
}