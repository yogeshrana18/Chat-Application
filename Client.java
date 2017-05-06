import java.io.*;
import java.net.*;

class Client
{
public static void main(String args[])throws Exception
{
Socket sc = new Socket("localhost",6666);
System.out.println("Ready to Send Data");
String msg;
Console c = System.console();

System.out.println("Enter Your name to chat Please:");
String clientname = c.readLine();
DataOutputStream dos5 = new DataOutputStream(sc.getOutputStream());
dos5.writeUTF(clientname);
DataInputStream dis5 = new DataInputStream(sc.getInputStream());
String servername = dis5.readUTF();


do{
System.out.println("::");
msg = c.readLine();
DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
dos.writeUTF(msg); 
DataInputStream dis1 = new DataInputStream(sc.getInputStream());
String msg2 = dis1.readUTF();
System.out.println(servername+" :: "+msg2);
}
while(!msg.equals("exit"));

}





}
