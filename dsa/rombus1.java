class Main {
    public static void rombus(int n){
        
        for(int i = 1; i<=n; i++){
            for(int j=n; j>=i; j--){
              System.out.print(" ");
            }
            for(int j=1; j<=5; j++){
                if(i==1 || i == 5 || j==1 || j==5){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
        
       
    
    }
    public static void main(String[] args) {
       
    rombus(5);
    }
        
        
}