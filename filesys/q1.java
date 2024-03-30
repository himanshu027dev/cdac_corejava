import java.io.*;
import java.util.*;


public class q1
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		try(FileOutputStream fos=new FileOutputStream("e:\\ab1.txt"))
		{
			try(DataOutputStream dos=new DataOutputStream(fos))
			{	int a;
				a = sc.nextInt() ; 
				while(a!=0){
					dos.writeInt(a);
					a = sc.nextInt() ; 
					
				}
			}
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}

		try(FileInputStream fis=new FileInputStream("e:\\ab1.txt"))
		{
		try(DataInputStream dis=new DataInputStream(fis))
		{
			while(dis.available()!=0)
			{
			System.out.println(dis.readInt());
			}
			
		}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}




























			