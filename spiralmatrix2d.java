

public class spiralmatrix2d {
    
    // Main method
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}

        }
        int startRow = 0;
        int startColn = 0;
        int endRow = matrix.length-1;
        int endColn = matrix[0].length-1;
        while(startRow<=endRow & startColn <= endColn ){

            //column left to right
            for(int j = startColn; j <= endColn; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //top to bottom last row
            for(int i = startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endColn]+" ");
            }
        }
        
    }
    }