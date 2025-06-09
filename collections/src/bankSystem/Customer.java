package bankSystem;

import java.util.ArrayList;

public class Customer 
{
    private String name;
    private long accountNumber;
    private double balance;
    ArrayList<Address> customerAddress= new ArrayList<>();

    public Customer(String name, long accountNumber, double balance)
    {
        this.name=name;
        this.accountNumber= accountNumber;
        this.balance= balance;
    }

    public void addCustomerAddress(Address address)
    {
        customerAddress.add(address);
    }

    public String getCustomerName()
    {
        return name;
    }
    public long getAccountNumber()
    {
        return accountNumber;
    }
    public double balance()
    {
        return balance;
    }

    public ArrayList<Address> getAddressList() 
    {
        return customerAddress;
    }

    public String toString()
    {
        return "Name: "+name+
        "Account number: "+accountNumber+
        "Balance: "+balance+
        "Address: "+customerAddress;
    }
}
