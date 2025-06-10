package hashSet;
import java.util.HashSet;
public class HashSetDemo 
{
    public static void main(String[] args) 
    {
        HashSet<String> fruits= new HashSet<>(); //creating a hashset
        //input
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");    
        //prints the content in a brackated format
        System.out.println("HashSet contains: "+fruits);
        //checks for the content and return either true or false
        boolean containsApple= fruits.contains("Apple");
        System.out.println("Fruits contains apple : "+containsApple);
        //To access and use the concept of "UNIQUENESS"
        System.out.println("Accessing elements in the HashSet:");
        for(String s:fruits)
        {
            System.out.println(s);
        }
        //Prints the size of the hashset
        System.out.println("Size of the HashSet: "+fruits.size());
        //Removes something from the hashset
        fruits.remove("Banana");
        System.out.println("HashSet after removing banana: "+fruits);
    }
}
