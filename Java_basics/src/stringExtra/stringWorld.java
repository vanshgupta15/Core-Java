package stringExtra;

public class stringWorld 
{
    public static void main(String[] args) 
    {
        //String
        String s = "Hello";
        s.concat(" World");
        System.out.println(s);  // Output: Hello (not changed)

        s = s.concat(" World"); 
        System.out.println(s);  // Output: Hello World (new string assigned)


        //String Builder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);  // Output: Hello World
    
        //How to change value of string builder ????
        //METHOD-1
        // Clear the existing content
        sb.setLength(0);
        // Add new value
        sb.append("World");
        System.out.println(sb);
        //METHOD-2
        sb.replace(0, sb.length(), "Java");
        System.out.println(sb);  // Output: Java
        //METHOD-3
        sb.delete(0, sb.length());  // delete all
        sb.append("New Value");
        System.out.println(sb);  // Output: New Value

        //String Buffer
        StringBuffer ab = new StringBuffer("Hello");
        ab.append(" World");
        System.out.println(ab);  // Output: Hello World
    }
}
