class Vehicle{

    public Vehicle() {
        System.out.print("this is vehicle");
    }
    
    
 }
 class car extends Vehicle{
    public car(){
        System.out.print("this is car");
    }
 }
 class MultilevelInheritance extends car{

    public MultilevelInheritance() {
        System.out.println(" and this is MultilevelInheritance");
    }

   public static void main(String[] args) {
       System.out.println("Creating MultilevelInheritance object:");
       MultilevelInheritance m = new MultilevelInheritance();
   }
    
 }