import java.util.Scanner;

public class Hashing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
       
        int[] arr = {3,3,4,5,6,3,2};

        // Read array elements
        

        // precompute
        int[] hash = new int[13];
        for (int i = 0; i < arr.length; i++) {
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