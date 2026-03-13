class setZeroesBrute {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        // Step 1: Remember if first row or first column needs to become zero
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;
        
        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == 0) {
                firstRowHasZero = true;
                break;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }
        
        // Step 2: Use first row & first column to mark zeros (skip [0][0] for now)
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;  // mark this column
                    matrix[0][j] = 0;  // mark this row
                }
            }
        }
        
        // Step 3: Set zeros for the rest of the matrix (using markers)
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        // Step 4: Handle first row (if needed)
        if (firstRowHasZero) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }
        
        // Step 5: Handle first column (if needed)
        if (firstColHasZero) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}