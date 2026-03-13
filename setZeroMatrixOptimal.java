class setZeroMatrixOptimal {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int n = matrix.length;    // rows
        int m = matrix[0].length; // columns

        // We only use two boolean variables → constant space
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        // ───────────────────────────────────────────────
        // 1. Check if first row or first column has any zero
        //    (must do this BEFORE we start overwriting them)
        // ───────────────────────────────────────────────
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

        // ───────────────────────────────────────────────
        // 2. Use first row & first column as flags/markers
        //    (we skip index 0 in both directions)
        // ───────────────────────────────────────────────
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;   // mark: this column should be zero
                    matrix[0][j] = 0;   // mark: this row should be zero
                }
            }
        }

        // ───────────────────────────────────────────────
        // 3. Set zeros in the rest of the matrix (using flags)
        // ───────────────────────────────────────────────
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // ───────────────────────────────────────────────
        // 4. Handle first row (if it originally had a zero)
        // ───────────────────────────────────────────────
        if (firstRowHasZero) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // ───────────────────────────────────────────────
        // 5. Handle first column (if it originally had a zero)
        // ───────────────────────────────────────────────
        if (firstColHasZero) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}