import java.util.*;

public class recusionName {

    public static void name(int i, int n) {
        if (i > n) {
            return;
        }
        else {
            System.out.println("om");
            name(i + 1, n);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Move Scanner inside main
        System.out.print("add number: ");
        int n = sc.nextInt();
    name(1, n);
    }
}