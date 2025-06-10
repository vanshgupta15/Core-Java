package apnaHashMap;
import java.util.*;
public class StudentDemo
{
    public static void main(String[] args) 
    {
        Student vansh= new Student("Vansh Gupta", 19, 15);
        Student badshah= new Student("Bad boy", 40, 100);
        HashMap<Integer,Student> students= new HashMap<>();
        students.put(vansh.getId(),vansh);
        students.put(badshah.getId(),badshah);

        System.out.println(students);
    }
}