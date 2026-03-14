class rotateMatrix {
    public void rotate(int[][] matrix) {
    int n = matrix.length;
        // Assuming square matrix → we ignore m (but you can keep the check if needed)
        
        // Step 1: Transpose (only swap upper triangle)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {   // ← key fix: j starts from i+1
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    

    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        rotateMatrix rm = new rotateMatrix();
        rm.rotate(matrix);

        System.out.println("\nRotated Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}        