package nplab;
import java.net.*;
import java.util.*;

public class IPFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter host name: ");
		host=input.next();
		try {
			InetAddress address=InetAddress.getByName(host);
			System.out.println("IP Address: "+address.toString());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
