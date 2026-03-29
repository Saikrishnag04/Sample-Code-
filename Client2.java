import java.io.*;
import java.net.*;

class Client2 {
    public static void main(String args[]) throws Exception {
        // Create client socket
        Socket s = new Socket("localhost", 8888);

        // To send data to server
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        // To receive data from server
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        // To read data from keyboard 
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        // Now communicate with server
        String str, str1;

        while (true) {
            // Read from keyboard
            str = kb.readLine();

            if (str.equalsIgnoreCase("Exit")) {
                break;
            }

            // Send to server
            dos.writeBytes(str + "\n");

            // Read server response
            str1 = br.readLine();
            System.out.println("Server: " + str1);
        }

        // Disconnect the server 
        s.close();
        br.close();
        kb.close();
        dos.close();
    }
}
