public class recusiont {
    static int c = 0;
    public static void count(){

        if(c==6){
            return;
        }
        else{
            System.out.println(c);
            c++;
     count();
        }
   }
    public static void main(String[] args) {
       
     count();
}

}