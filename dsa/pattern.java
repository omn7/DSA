public class pattern {
    
    public static void main(String[] args) {
        char ch = 'A';
        // Your code goes here
       for(int i = 1; i<=4; i++){ // Outer loop for rows
        for(int j = 1; j<=i; j++){ // Inner loop for columns
           
            
            System.out.print(ch++);
        }
        System.out.println(); // Print a new line after each row
       }
    }
}