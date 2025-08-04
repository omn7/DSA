public class staircasematrix {
    public static void main(String[] args) {
        // Your code here
       int matrix[][] = {
            {10,  20,  30,  40},
            {15,  25,  35,  40},
            {27,  29,  37,  48},
            {32,  33,  39,  50 }
        };
        int key = 33;
        int col = matrix.length[0]-1;
        int row = 0;
        while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.println(row + "," + col);
            }
            else if(matrix[row][col] > key){
                col--;
            }
            else{
                row ++;
            }
        }
        
        
    }
}