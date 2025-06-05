package CustomerAddress;
import java.io.*;
public class Address implements Serializable
{
    private String country;
    private String state;
    private int pincode;
    private String street;

    public void Address(String country, String state, int pincode, String street)
    {
        this.country=country;
        this.state=state;
        this.pincode=pincode;
        this.street=street;
    }

    
}
