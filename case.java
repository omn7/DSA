import java.util.*;
public class NumberChecker{
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
         int a = sc.nextInt();
        if(a > 0){
            System.out.println("The Number is Positive");    
             
        }
        if(a < 0) {
            System.out.println("The Number is Negative");
        }
        else {
            System.out.println("The Number is Zero");
        }
        
        }
    }
}