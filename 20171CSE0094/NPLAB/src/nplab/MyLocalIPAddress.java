package nplab;
import java.net.*;
public class MyLocalIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress address=InetAddress.getLocalHost();
			System.out.println(address);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
