import java.util.*;
class hasing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcdeabca";
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)-'a']++;
        }
        System.out.println("Enter the number in array");
        int q = sc.nextInt();
        while(q-->0){
            System.out.println("Enter the character to check");
            char c = sc.next().charAt(0);
            System.out.println(c-'a');
        }



    }
}