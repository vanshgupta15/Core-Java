import java.util.ArrayList;
public class ArrayListDemo 
{
    public static void main(String[] args) 
    {
        ArrayList list=new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add(42);
        list.add(3.14);

        System.out.println("ArrayList content:");
        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("Size of the array: "+list.size());

        //Demonstrating "type safety" with generics 
        ArrayList<String> stringList= new ArrayList<String>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("c++");

        System.out.println("ArrayList created:");
        for (int j = 0; j <stringList.size() ; j++)
        {
            System.out.println(stringList.get(j));
        }
        System.out.println("Size of stringlist: "+stringList.size());

        //using wrapper class
        ArrayList<Integer> intList= new ArrayList<Integer>();
        intList.add(1);
        int i=2;
        intList.add(i);
        Integer j= Integer.valueOf(3);
        intList.add(j);

        System.out.println("Integer aarraylist:");
        for (int k = 0; k < intList.size(); k++) 
        {
            System.out.println(intList.get(k));
        }
        System.out.println("Size of array list: "+intList.size());
    }
}
