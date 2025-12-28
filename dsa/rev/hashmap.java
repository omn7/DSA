
import java.util.HashMap;

class hashmap{
    public static void main(String[] args) {
        HashMap<String, Integer> country = new HashMap<>();
        country.put("India", 50);
        country.put("Spain", 32);
        if(country.containsKey("china")){
           System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}