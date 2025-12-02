public class RotateTheArrayByDburtef {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int d = 3;

        System.out.print("Original array: ");
        printArray(arr);

        // Use the Solution.rotate method to rotate by d
        Solution sol = new Solution();
        sol.rotate(arr, d);

        System.out.print("Rotated array by " + d + ": ");
        printArray(arr);
    }

    private static void printArray(int[] a) {
        for (int v : a) System.out.print(v + " ");
        System.out.println();
    }
}

// package-private helper class (not public so file can have single public class)
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;
        k = k % n;
        if (k == 0) return;

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}