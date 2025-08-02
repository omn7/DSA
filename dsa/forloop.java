
import java.util.Scanner;



public class forloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
       for(int i = 0; i < 10; i++){
        
         int n = sc.nextInt();
        if(i%n == 0){
            System.out.println(i + "is an prime number");
        }
       }


    }
}
