//Calvin LaClair//
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenTest 
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's your sentence? *Note it only looks for 'b'");
		String userInput = scanner.nextLine();
		int letters = 0;
		
		String [] tokenUser = userInput.split(" ", -1);
		String [] tokenOccurrences = new String[tokenUser.length];
		
		StringTokenizer start = new StringTokenizer(userInput);
		while(start.hasMoreTokens())
		{
			String string = start.nextToken();
				if(string.charAt(0) == 'b')
				{
					tokenOccurrences[letters++] = string;
				}
				
				
		}
		
		System.out.println("These are the tokens that come up with the letter 'b'.");
		
			for(int i = 0; i < tokenOccurrences.length; i++)
			{
				System.out.println(tokenOccurrences[i]);
			}
		scanner.close();
	}
	
}
