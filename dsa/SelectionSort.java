import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // Pick the smallest and put it at the beginning
        int[] arr = {9, 2, 5, 3, 8, 4};

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {  // Compare with current minPos
                    minPos = j;
                }
            }
            // Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
