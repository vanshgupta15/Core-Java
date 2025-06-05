package CustomerAddress;
import java.util.ArrayList;

public class Customer 
{
    ArrayList customer = new ArrayList();
    
    public void addressList()
    {
        Address address= new Address();
        customer.add(address);
    }
    public void showDetails()
    {
        for (int i = 0; i <customer.size() ; i++) 
        {
            System.out.println(customer.get(i));
        }
    }

}