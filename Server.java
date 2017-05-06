import java.net.*;
import java.io.*;

class Server
{
public static void main(String args[])throws Exception
{
ServerSocket ss = new ServerSocket(6666);
System.out.println("Server Started ");
Socket sc =ss.accept();
System.out.println("Client Connected");
String msg1,msg,clientname;
Console c1 = System.console();
DataInputStream dis4 = new DataInputStream(sc.getInputStream());
clientname = dis4.readUTF();

System.out.println("Enter Your name to chat Please:");
String servername = c1.readLine();
DataOutputStream dos4 = new DataOutputStream(sc.getOutputStream());
dos4.writeUTF(servername);






do{

DataInputStream dis = new DataInputStream(sc.getInputStream());
msg = dis.readUTF();
System.out.println(clientname+" :: "+msg);
System.out.println("::");
msg1 = c1.readLine();
DataOutputStream dos1 = new DataOutputStream(sc.getOutputStream());
dos1.writeUTF(msg1);

}
while(!(msg1.equals("exit") || msg.equals("exit")));


}



}

