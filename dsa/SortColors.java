public class SortColors {
    public void sortColors(int[] nums) {
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        
        // First pass: count each color
        for (int num : nums) {
            if (num == 0) countZero++;
            else if (num == 1) countOne++;
            else if (num == 2) countTwo++;
        }
        
        // Second pass: overwrite array with the correct values
        int i = 0;
        
        // Place all 0s
        while (countZero > 0) {
            nums[i++] = 0;
            countZero--;
        }
        
        // Place all 1s
        while (countOne > 0) {
            nums[i++] = 1;
            countOne--;
        }
        
        // Place all 2s
        while (countTwo > 0) {
            nums[i++] = 2;
            countTwo--;
        }
    }

    public static void main(String[] args) {
        SortColors solution = new SortColors();
        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println("Original Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        solution.sortColors(nums);

        System.out.println("Sorted Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
