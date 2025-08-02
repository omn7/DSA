import java.util.*;

public class linearSearch {

    public static int number(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {12, 13, 14, 15};
        System.out.print(number(numbers));
    }
}
