package bankingSystem.bankSystem;

import java.util.ArrayList;

public class BankBranch extends Bank
{
    private String branchName;
    private int code;
    private ArrayList<Customer> customers=new ArrayList<>();
    private Address branchAddress;

    public BankBranch(String branchName, int code)
    {
        this.branchName= branchName;
        this.code=code;
    }

    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }

    public void setBranchAddress(Address branchAddress)
    {
        this.branchAddress=branchAddress;
    }

    public String getBranchName()
    {
        return branchName;
    }
    public int getCode()
    {
        return code;
    }
    public String toString()
    {
        return "Bank:"+super.getName()+
        "  Licence number: "+super.getLicence()+
        "  Branch name: "+branchName+
        "  Branch code: "+code+
        "  Branch Address"+branchAddress+
        "Customers:-\n"+customers;
    }
}
