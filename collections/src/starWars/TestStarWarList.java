package starWars;

public class TestStarWarList 
{
    public static void main(String[] args) {
        // Create a new customer
        Customer customer = new Customer("Luke Skywalker", "luke@darthVedar.com");
        // create first address
        Address address1 = new Address("123 Jedi Way", "Tatooine", "Tatooine", "12345", "Galaxy Far Far Away");
        // create second address
        Address address2 = new Address("456 Jedi Way", "Tatooine", "Tatooine", "12345", "Galaxy Far Far Away");
        // Add addresses to the customer
        customer.addAddress(address1);
        customer.addAddress(address2);
        // Print customer details
        System.out.println(customer);

    }
}
