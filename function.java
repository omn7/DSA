import java.util.Scanner;
public class function {
    public static int name(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
           f = f*i;
        }
        System.out.println("Factorial of " + n + " is: " + f);
        return f;
    }
    public static int rfac(int r){
        int f = 1;
        for(int i = 1; i<=r; i++){
            f = f*i;
        }
        System.out.println("Factorial of " + r + " is: " + f);
        return f;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
       
        int fac1 = name(n); // Calling the function
        System.out.println("Enter another number: ");

        int r = sc.nextInt();
        int fac2 = rfac(r); // Calling the function
        int sub = n-r;
        
        int finalfac = fac1/(fac2*sub);
        System.out.println("The final factorial is: " + finalfac);
        sc.close();
       
       
        
    }
}