import java.util.*;
public class ifelse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        
        int salary = sc.nextInt();
       
        String result = (salary > 20000) ? "High salary" : "Low salary";
        System.out.println(result);
    }
}

