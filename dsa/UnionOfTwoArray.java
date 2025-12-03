import java.util.*;

public class UnionOfTwoArray {
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        
        // Add all elements from both arrays
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        
        // Convert set to ArrayList
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};

        ArrayList<Integer> union = findUnion(arr1, arr2);

        System.out.println("Union of two arrays:");
        for (int num : union) {
            System.out.print(num + " ");
        }
        // Output: 1 2 3 4 5 6 7 8 9 10 11 12 
    }
}