class Subarray {
    public static void sub(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                // Print subarray from index i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    
                }
                System.out.println();
                int sum = numbers[i]+numbers[j];
                System.out.println("sum "+sum);
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 5, 6, 7, 8, 9};
        sub(numbers);
    }
}
