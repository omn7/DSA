import java.util.*;


public class recusionName{


        Scanner sc = new Scanner(System.in);
    public static void name(int i, int n){

        if(i>n){
            return;
        }
        System.out.println("om");
        name(i+1, n);

    }
    public static void main(String[] args) {
        System.out.print("add number");
        n = sc.nextInt(n);
        name(1, n);
    }
}