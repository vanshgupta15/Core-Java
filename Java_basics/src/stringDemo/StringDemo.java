package stringDemo;

public class StringDemo 
{
    public static void main(String[] args) 
    {
        String str1="Hello";
        String str2="World";
        String str3=new String("Ye string 3 hai");
        System.out.println(str3);
        String str4= str1+" "+str2;
        System.out.println(str4);
        int i=3;
        String str5= "String"+i;  //concatination
        
        String name1 = "John";
        String name2 = "John";
        String name3 = new String("John");
        String name4 = "john";

        System.out.println("Equals1: "+name1.equals(name2));
        System.out.println("Equals1.1: "+name1.equalsIgnoreCase(name4));
        System.out.println("Equals2: "+name1.equals(name3));

        //using == operator compares the reference of the objects
        System.out.println("==: "+ (name1==name2));
        System.out.println("==:"+ (name1==name3));
        System.out.println("Equals3: "+ str1.equals(str5));
    }
}
