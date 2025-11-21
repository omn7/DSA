import java.util.*;
//1 to N
public class recursionBacktracking{

    public static void backtracking(int i, int n){
        if(i<1){
            return;
        }
        else{
            backtracking(i-1, n);
            System.out.println(i);

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    backtracking(n, n);

    }
}