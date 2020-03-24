import java.util.Scanner;

public class EvenOdd
{
	public static boolean main (String args[])
	{
		int firstNum;
		boolean even = true;
		boolean odd = false;
		
		System.out.println("Enter an Integer:");
		
		Scanner input = new Scanner(System.in);
		firstNum = input.nextInt();
		
		if(firstNum % 2 == 0)
		{	
			return even;
		}
		
		else
		{	
			return odd;
		}

	}
}
