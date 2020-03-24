//Calvin M LaClair
//Factorial problem, create a program
//that can do 20!.

public class factorial 
{
	public static void main(String[] args) 
	{
		    long factorial = 1;

		    for (int i = 1; i <= 20; i = i + 1) 
		    {
		      factorial = 1;
		      int j = 2;
		      while (j <= i)
		        factorial *= j = j + 1;
		      System.out.println(i + "!" + " is " + factorial);
		    }
    }
}


