import java.util.*;
public class ifelse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        
        int a = sc.nextInt();
       
        if(a<500000){
            System.out.println(a +" Your tax is 0% please earn more");
        }
        else if(a>500000 && a<1000000){
            System.out.println(a +" You have to pay the tax 20% ");
        }
        else{
            System.out.println("Pay 30%");
        }
    }
}

