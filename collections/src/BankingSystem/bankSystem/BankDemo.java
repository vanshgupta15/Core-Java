package bankingSystem.bankSystem;

public class BankDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the bank: ");
        
        BankBranch mainBranch= new BankBranch("Main branch",001);
        Address mainBranchAddress = new Address("Convent road", "Dehradun", 248001, "Uttrakhand"); 
        mainBranch.setBranchAddress(mainBranchAddress);

        Customer vansh= new Customer("Vansh Gupta",465234432,532423.50);
        Address vanshAddress= new Address("Laxman Chowk", "Dehradun", 248001, "Uttrakhand");
        vansh.addCustomerAddress(vanshAddress);
        mainBranch.addCustomer(vansh);
        
        Customer rahul=new Customer("Rahul Kumar", 5241376, 1000);
        Address rahulAddress= new Address("Saraswati enclave", "DehraDun", 248001, "Uttrakhand");
        rahul.addCustomerAddress(rahulAddress);
        mainBranch.addCustomer(rahul);

        System.out.println(mainBranch);
        // System.out.println(vansh);
    }    
}
