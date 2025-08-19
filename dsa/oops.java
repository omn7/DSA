public class oops{
    public static void main(String[] args){
        BankAccount myAcc = new BankAccount();
        myAcc.username = "om";
        myAcc.setPassword("abc123");
        System.out.println(myAcc.username);
    }
}

class BankAccount{
    
    // here we use access Modifiers the public can be accessed from anywhere but the private can only access only in class BankAccount


    public String username;
    private String password;
    //so to set the value of password in main file we use the following code but the password can't be visible from main files.
    public void setPassword(String pwd){
        password = pwd;
    }
}