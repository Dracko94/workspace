//Calvin LaClair//
import java.util.Scanner;
import java.util.TreeSet;

public class Treeset 
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert text on one line with spaces.");
		String[] input = scanner.nextLine().split(" ");
		
		TreeSet<String> set = new TreeSet<String>();
	
		
			for(int i = 0; i < input.length; i++)
			{
				if (set.isEmpty() || !set.contains(input[i]))
				{
					set.add(input[i]);
				}
			
			}
		
		
			for(String array : set)
			{
				System.out.println("Token: " + array + " ");
			}
			scanner.close();
		
	}

}
