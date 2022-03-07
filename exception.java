import java.io.*;
import java.util.Scanner;
class exception
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,result;
		System.out.println("Enter values of a, b and c:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(b==0 && c==0)
			throw new ArithmeticException("Invalid Values.");
		try
		{
			result=a/(b-c);
			System.out.println("Result: "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught:Division by zero.");
		}
		finally
		{
			System.out.println("Operation Complete.");
		}
	}
}