public class prime1 {

    public static void prime(int n) {
        for(int i =2; i<=(n-1); i++){
            if(n%i==0){
                System.out.println("Not a prime number: " + i);
                break;
            }
            else{
                System.out.println("Prime number: " + i);
                break;
            }
        }
        
    }
    public static void main(String[] args) {
       prime(50); // Calling the function to check if 5 is prime
    }
}