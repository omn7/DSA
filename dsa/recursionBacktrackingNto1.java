public class recursionBacktrackingNto1{

    public static void Backtracking(int i, int n){
       if(i<1){
        return;
       }
       else{
        Backtracking(i-1, n+i);
        System.out.println(n);
       }
    }
    public static void main(String[] args) {
    Backtracking(5, 0);
    }
}