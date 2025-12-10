// Parent class
class Vehicle {
    void drive() {
        System.out.println("Vehicle is driving");
    }
}

// Child class extending Vehicle (Single Inheritance)
public class SingleInheratence extends Vehicle {
    
    SingleInheratence() {
        System.out.println("This is my car");
    }
    
   
    void drive() {
        System.out.println("Car is driving safely");
    }
    
    public static void main(String[] args) {
        SingleInheratence car = new SingleInheratence();
        car.drive();
    }
}