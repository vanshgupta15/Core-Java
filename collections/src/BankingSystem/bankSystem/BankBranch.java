package BankingSystem;

import java.util.ArrayList;

public class BankBranch extends Bank
{
    private String branchName;
    private int code;
    private ArrayList<Address> branchAddress=new ArrayList<>();

    public BankBranch(String branchName, int code)
    {
        this.branchName= branchName;
        this.code=code;
    }

    public void addBranchAddress(Address address)
    {
        branchAddress.add(address);
    }

    public String getBranchName()
    {
        return branchName;
    }
    public int getCode()
    {
        return code;
    }
    public ArrayList<Address> getAddressList() 
    {
        return branchAddress;
    }
    public String toString()
    {
        return "Bank:"+super.getName()+
        "Licence number: "+super.getLicence()+
        "Branch name: "+branchName+
        "Branch code: "+code+
        "Branch Address"+branchAddress;
    }
}
