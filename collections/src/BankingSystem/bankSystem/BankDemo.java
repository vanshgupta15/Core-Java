package BankingSystem;

public class BankDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the bank: ");
        
        BankBranch mainBranch= new BankBranch("Main branch",001);
        Address mainbranch = new Address("Convent road", "Dehradun", 248001, "Uttrakhand"); 
        mainBranch.addBranchAddress(mainbranch);

        Customer vansh= new Customer("Vansh Gupta",465234432,532423.50);
        Address vanshaddress= new Address("Laxman Chowk", "Dehradun", 248001, "Uttrakhand");
        vansh.addCustomerAddress(vanshaddress);

        System.out.println(mainBranch);
        System.out.println(vansh);
    }    
}
