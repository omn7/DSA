class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;
        
        while (top <= bottom && left <= right) {
            
            // 1. Traverse from left → right (top row)
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;   // move top boundary down
            
            // 2. Traverse from top → bottom (right column)
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;   // move right boundary left
            
            // 3. Traverse from right → left (bottom row) — but only if there's still a row left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;   // move bottom boundary up
            }
            
            // 4. Traverse from bottom → top (left column) — but only if there's still a column left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;   // move left boundary right
            }
        }
        
        return result;
    }
}