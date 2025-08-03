public class digonalsum {
    public static void main(String[] args) {

        
        // Your code here
       int[][] matrix = {
    {1,  2,  3,  4},
    {5,  6,  7,  8},
    {9, 10, 11, 12},
    {13,14, 15,16}
};

        //fuckk it has time complexity of 0(n2)

    int n = matrix.length;
    int sum = 0;
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                if(i==j){
                    sum+= matrix[i][j];
                }
                if(i+j == n-1){
                    sum+= matrix[i][j];
                }
            }
             System.out.println("Sum of diagonals: " + sum);
        }


        //for the time complexity of O(n)
        for(int i =0; i<n; i++){
            sum += matrix[i][i];

            if(i != n-i-1){
                sum+= matrix[i][n-i-1];
            }
            System.out.println("Sum of diagonals: " + sum);
        }
        
       

    }


}