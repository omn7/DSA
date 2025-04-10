public class firstnatural {
    public static void main(String[] args){
        int i = 1;
        int n = 10;
        int sum =0;
        while(i<=n){
            System.out.println(sum);
            sum = sum + i;
            i++;
            System.out.println("Sum of first " + n + " natural number is: " + sum);

        }
    }
}