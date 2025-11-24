import java.util.Scanner;

public class HashingForAllChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "abcdabca";

        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
            //use s.charAt(i) instated of i
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.print("Enter character to check: ");
            char c = sc.next().charAt(0);
            // fetch
            System.out.println("Count: " + hash[c]);
        }
    }
}