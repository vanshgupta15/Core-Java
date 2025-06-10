package bankingSystem.bankSystem;

public class Address 
{
    String street;
    String city;
    int pinCode;
    String state;

    public Address(String street, String city, int pinCode, String state) 
    {
        this.street = street;
        this.city = city;
        this.pinCode = pinCode;
        this.state = state;
    }

    // generate getters and setters for all fields
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(String zipCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() 
    {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' + 
                '}';
    }
}
