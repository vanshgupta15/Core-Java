package bankSystem;

import java.util.ArrayList;

public class Customer 
{
    private String name;
    private long accountNumber;
    private double balance;
    ArrayList<Address> branchAddress= new ArrayList<>();

    public void Customer(String name, long accountNumber, double balance)
    {
        this.name=name;
        this.accountNumber= accountNumber;
        this.balance= balance;
    }


}
