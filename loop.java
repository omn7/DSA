import  java.util.*;
public class loop {
    public static void main(String[]  args){
        //to print number from 1 to 10
        System.out.println("Enter the number to print from 1 to that number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextByte();
        
    

        //for loop
        for(int i = 0; i<number; ++i){
            System.out.println(i+1);
        }

        System.out.println("Hello Number");
    }
}