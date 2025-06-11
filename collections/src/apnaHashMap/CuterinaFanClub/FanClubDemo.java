package apnaHashMap.CuterinaFanClub;
import java.util.*;
public class FanClubDemo
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        Fans fan0 = new Fans("Vansh Gupta", 19, "Male");
        Fans fan1 = new Fans("Bad boy", 40, "Female");
        Fans fan2 = new Fans("Ananya Roy", 22, "Female");
        Fans fan3 = new Fans("Rohit Sharma", 30, "Male");
        Fans fan4 = new Fans("Vansh Gupta", 21, "Male");        // repeated name
        Fans fan5 = new Fans("Priya Mehta", 25, "Female");
        Fans fan6 = new Fans("Bad boy", 39, "Male");             // repeated name
        Fans fan7 = new Fans("Karan Patel", 27, "Male");
        Fans fan8 = new Fans("Sneha Kapoor", 23, "Female");
        Fans fan9 = new Fans("Riya Das", 20, "Female");
        Fans fan10 = new Fans("Rohit Sharma", 31, "Male");        // repeated name
        Fans fan11 = new Fans("Tanya Bhatia", 26, "Female");
        Fans fan12 = new Fans("Aman Verma", 28, "Male");
        Fans fan13 = new Fans("Megha Singh", 24, "Female");
        Fans fan14 = new Fans("Ananya Roy", 22, "Female");  
        HashMap<String,Fans> fanBase= new HashMap<>();
        Fans[] fansArray = {fan0, fan1, fan2, fan3, fan4, fan5, fan6,fan7, fan8, fan9, fan10, fan11, fan12, fan14};
        for (Fans f : fansArray) 
        {
            fanBase.put(f.getName(), f);
        }
        System.out.println("Cuterina please enter your fan name: ");
        String n= sc.nextLine();
        boolean containsFan= fanBase.containsKey(n);
        if(containsFan=true)
        {
            Fans fanData= fanBase.get(n);
            System.out.println(fanData);
        }
        else
        {
            System.out.println("No such fan dear Cuterina");
        }
    }
}