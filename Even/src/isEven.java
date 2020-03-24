import java.util.Scanner;

public class isEven
{

	public static boolean main (String args[])
	{
		Scanner input = new Scanner(System.in);
		int firstNum;
		boolean even = true;
		boolean odd = false;
		
		System.out.println("Enter an Integer:");
		
		input = new Scanner(System.in);
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
