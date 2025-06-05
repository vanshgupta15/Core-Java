import java.util.Scanner;

public class Initials
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        String s= sc.nextLine();
        System.out.print("Initials are :"+s.charAt(0));
        for (int i = 2; i < s.length(); i++) 
        {
            if(s.charAt(i-1)==' ')
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}
//string tokenizer