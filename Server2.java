import java.io.*;
import java.net.*;
class Server2
{
public static void main(String args[])throws IOException 
{
//create server socket
ServerSocket ss=new ServerSocket(8888);
Socket s=ss.accept();
System.out.println("Connection Establishment");
//to send data to client
PrintStream ps=new PrintStream(s.getOutputStream());
//To receive data from Client 
BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
//to read data from keyboard 
BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
//Now communicate with client 
//server Run Contiously
while(true)
{
String str,str1;
while ((str = br.readLine()) != null)

{
System.out.println(str);
str1=kb.readLine();
ps.println(str1);
//disconnect the server 
ss.close();
s.close();
ps.close();
br.close();
kb.close();
System.exit(0);
}
}
}
}