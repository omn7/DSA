// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       
        int n = 6;
        int counter = 1;
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
          
            System.out.println();
        }
    }
}