package starWars;
import java.util.*;
public class Customer 
{
    private String name;
    private String email;
    private ArrayList<Address> addressList;

    // constructor
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.addressList = new ArrayList<>();
    }

    // method to add an address
    public void addAddress(Address address) {
        addressList.add(address);
    }

    // method to remove an address
    public void removeAddress(Address address) {
        addressList.remove(address);
    }

    // method to get all addresses
    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    // getters and setters for name and email
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", addresses=" + addressList +
                '}';
    }

}
