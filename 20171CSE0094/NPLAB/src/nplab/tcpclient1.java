package nplab;
import java.io.*;
import java.net.*;
public class tcpclient1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Socket s=new Socket("localhost",55);
		 DataInputStream in=new DataInputStream(s.getInputStream());
		 DataOutputStream out=new DataOutputStream(s.getOutputStream());
		 String str=in.readLine();
		 System.out.println("string from TCP server\n"+str); 
	}

}
