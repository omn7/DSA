public class MoveZerosTest {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        System.out.print("Original: ");
        for (int v : arr) System.out.print(v + " ");
        System.out.println();

        new Solution().moveZeroes(arr);

        System.out.print("After:    ");
        for (int v : arr) System.out.print(v + " ");
        System.out.println();
    }
}
