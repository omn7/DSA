import java.util.Scanner;

public class Hashing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // precompute
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        // Read number of queries
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.print("Enter number to check: ");
            int number = sc.nextInt();
            // fetch
            System.out.println("Count: " + hash[number]);
        }
        sc.close();
    }
}