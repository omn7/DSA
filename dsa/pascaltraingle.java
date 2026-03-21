
import java.util.*;

public class pascaltraingle {

	// LeetCode-style: Implement this method
    public static List<List<Integer>> generatePascalTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int num1 = triangle.get(i - 1).get(j - 1);
                    int num2 = triangle.get(i - 1).get(j);
                    row.add(num1 + num2);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }

    // Main method for input/output (like LeetCode)
    public static void main(String[] args) {
        int numRows = 5; // You can change this value to test
        List<List<Integer>> result = generatePascalTriangle(numRows);
        
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
