package apnaHashMap;
import java.util.HashMap;
public class HashMapDemo 
{
    public static void main(String args[])
    {
        HashMap<String, Integer> hashMap= new HashMap<>();

        //add elemnets to the hashmap
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Orange", 3);
        hashMap.put("Apple", 4);

        //Display the content of the HashMap
        System.out.println("HashMap content: "+hashMap);

        //Check if a key exists in the HashMap
        boolean containsApple= hashMap.containsKey("Apple");
        System.out.println("HashMap contains 'Apple': "+containsApple);

        //Get a value from the HashMap using a key
        Integer appleValue= hashMap.get("Apple");

        //size of the HashMap
        System.out.println("Size of the HashMap: "+hashMap.size());

        //Remove an element from the HashMap
        hashMap.remove("Banana");
        System.out.println("HashMap after removing 'Banana:" +hashMap);
    }
}
