import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class WhoIsClientimport
{
    public static void main(String[] args) 
    {
        if(args.length<1)
        {
            return;
        }
        String domainName= args[0];

        String hostName= "whois.internic.net";
        int port=43;
        System.out.println("Connecting to "+hostName+" on port "+port+" for domain "+domainName);
        try(Socket socket= new Socket(hostName,port))
        {
            System.out.println("Connected to "+hostName+" on port "+port);
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            System.out.println("Sending domain name: " + domainName);
            writer.println(domainName);
            System.out.println("Waiting for response...");
            InputStream input = socket.getInputStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String line;
            System.out.println("Response from server:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (Exception ex) 
        {
            System.out.println("Server not found: " + ex);
        }

    }
}
