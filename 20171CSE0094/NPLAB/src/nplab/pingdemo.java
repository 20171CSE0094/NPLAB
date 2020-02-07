package nplab;
import java.io.*;
import java.net.*;
public class pingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in;
		try
		{
			Runtime r=Runtime.getRuntime();
			Process p=r.exec("Ping 127.0.0.1");
			
			if(p==null)
			System.out.println("could not connect");
			in=new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			
			while((line=in.readLine())!=null)
			{
				if(line.startsWith("reply"))
				System.out.println("this is reply");	
				else if(line.startsWith("request"))
				System.out.println("there is no reply");
				else if(line.startsWith("destinator"))
				System.out.println("destinator host unreachabl");
				else
				System.out.println(line);
			}
			System.out.println(in.readLine());
			in.close();
		} catch(IOException e)
		{System.out.println(e.toString());}
	         }
	}


