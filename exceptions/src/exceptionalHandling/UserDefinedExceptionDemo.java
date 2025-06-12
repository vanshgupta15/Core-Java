package exceptionalHandling;

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String m)
    {
        super(m);
    }
}

public class UserDefinedExceptionDemo
{
    static void validateAge(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("Age must be 18 or older");
        }
        else
        {
            System.out.println("Valid age");
        }
    }
    public static void main(String[] args) 
    {
        try
        {
            validateAge(16);
        }
        catch (InvalidAgeException e)
        {
            System.out.println("Error :"+e.getMessage());
        }
        finally
        {
            System.out.println("Bye bye");
        }
    }
}
