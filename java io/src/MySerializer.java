public class MySerializer 
{
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Springfield", "IL", "62701");
        System.out.println("Address to be serialized: " + address);

        try {
            java.io.FileOutputStream fileOut = new java.io.FileOutputStream("address.ser");
            java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(fileOut);
            out.writeObject(address);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in address.ser");
        } catch (java.io.IOException i) {
            i.printStackTrace();
        }
    }

}
