package nplab;
import java.io.*;
import java.net.*;

public class tcpserver1 {
	public static void main(String args[])throws IOException
	 {
	  ServerSocket ss=new ServerSocket(55);
	  Socket s=ss.accept();
	  DataInputStream in=new DataInputStream(s.getInputStream());
	  DataOutputStream out=new DataOutputStream(s.getOutputStream());
	  DataInputStream sysin=new DataInputStream(System.in);
	  System.out.println("Enter an string:");
	  String str=sysin.readLine();
	  out.writeBytes(str+"\n");
	  System.out.println("The string from TcP server"+in.readLine());
	  } 
}
