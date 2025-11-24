public class RecursionFabonacchi{
    public static int fabonacchi(int n){
        if(n<=1){
            return n;
        }
        return fabonacchi(n-1)+fabonacchi(n-2);
        

    }
    public static void main(String[] args) {
     int count = 10; // Number of Fibonacci terms to generate

        System.out.println("Fibonacci series up to " + count + " terms:");

        // Loop to print the Fibonacci series up to the specified count
        for (int i = 0; i < count; i++) {
            System.out.print(fabonacchi(i) + " ");
        }
    }
    }
