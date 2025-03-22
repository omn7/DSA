import  java.util.*;
public class index {
  public static void main(String[]  args){
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("Hello " + name);

    int a = 10;
    String b = "Hello";
    float c = 37.5f;
    double d = 10.5;

    //type conversion
    // this is the method use to give the value of one data type to another data type having highter memory is called type conversion.
    int e = 10;
    float f = e; //implicit type conversion
    //type casting
    // this is the method use to give the value of one data type to another data type having lower memory is called type casting.
    float g = 10.5f;
    int h = (int)g; //explicit type casting

    //type promotion
    // this is the method use to give the value of one data type to another data type having int memory if it is short,byte, int (largest possible varible) is called type promotion.
    byte i = 10;
    byte j = 20;
    int k = i + j; //type promotion
    System.out.println(k);

    System.out.println(a);
    System.out.println(b);
    System.out.println(c * d);
    System.out.println("the value is " + a);
    System.out.println("the value is " + f);
    System.out.println("the value is " + h);

  }
}