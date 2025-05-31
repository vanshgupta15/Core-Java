public class DeSerializer {
    public static void main(String[] args) {
        Address address = null;
        try {
            java.io.FileInputStream fileIn = new java.io.FileInputStream("address.ser");
            java.io.ObjectInputStream in = new java.io.ObjectInputStream(fileIn);
            address = (Address) in.readObject();
            in.close();
            fileIn.close();
        } catch (java.io.IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }
        System.out.println("Deserialized Address: " + address);
    }
}
