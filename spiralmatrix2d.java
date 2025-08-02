public class spiralmatrix2d {
    
    public static void main(String[] args) {
        int matrix[][] = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13,14, 15,16}
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
