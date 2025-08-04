public class spiralmatrix2d {
    
    public static void main(String[] args) {
        int matrix[][] = {
            {10,  20,  30,  40},
            {15,  25,  35,  40},
            {27,  29,  37,  48},
            {32,  33,  39,  50 }
        };

        int startRow = 0;
        int startColn = 0;
        int endRow = matrix.length - 1;
        int endColn = matrix[0].length - 1;

        while (startRow <= endRow && startColn <= endColn) {

            // Column: Left to Right
            for (int j = startColn; j <= endColn; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Row: Top to Bottom
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endColn] + " ");
            }

            // Column: Right to Left (only if startRow < endRow to avoid duplicate)
            if (startRow < endRow) {
                for (int j = endColn - 1; j >= startColn; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
            }

            // Row: Bottom to Top (only if startColn < endColn to avoid duplicate)
            if (startColn < endColn) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(matrix[i][startColn] + " ");
                }
            }

            // Move to inner layer
            startRow++;
            endRow--;
            startColn++;
            endColn--;
        }

        System.out.println(); // newline after output
    }
}
