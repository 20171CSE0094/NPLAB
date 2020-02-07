package nplab;
import java.net.*;
import java.io.*;

public class DatagramServer {
	public static DatagramSocket ds;				
	public static int clientport=789, serverport=790;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte buffer[]=new byte[1024];
		ds=new DatagramSocket(serverport);			
		BufferedReader breader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Server is waiting for input");
		while(true)
		{	String str=breader.readLine();
			if(str==null || str.equals("End"))
				break;
			buffer=str.getBytes();
ds.send(new DatagramPacket(buffer, str.length(), InetAddress.getLocalHost(),clientport));	
		}
	}

}
