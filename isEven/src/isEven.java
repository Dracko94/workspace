//Calvin LaClair: Create a program that utilizes booleans,
// and is able to tell numbers from being even or odd.
	
import java.util.Scanner;

	public class isEven
	{
		public static void main (String[] args)
		{
			int num = 0;
			boolean even = true;
			
			Scanner integer = new Scanner(System.in);
			
			System.out.println("Enter integers, and enter -1 to end.");
			num = integer.nextInt();
			
			while(num != -1)
			{
				if(num % 2 == 0)
				{
					even = true;
					System.out.println(" The Value of " + num + " is even!");
					System.out.println("Enter integers, and enter -1 to end.");
					num = integer.nextInt();
				}
				else
				{
					even = false;
					System.out.println("The Value of " + num + " is odd!");
					System.out.println("Enter integers, and enter -1 to end.");
					num = integer.nextInt();
					
				}
				
				
			}
			integer.close();
		}
		
	}
