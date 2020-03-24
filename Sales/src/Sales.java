//Calvin M LaClair//
//yay for methods as I know them in c++, functions.//
import java.util.Scanner;
public class Sales 
{
	public double salary;
	
	
	//Method to get the salary, and perform the calculations//
    public double getSalary( int salesGross )
    {
    	double salary = ((salesGross * 0.09) + 200);
    	return salary;
	}

    //method to output the numbers//
    public void displayMessage( int arrayCounter[])
	{
        for (int displayCount = 0; displayCount < 9; displayCount++ )
	    System.out.println(displayCount + ": " + arrayCounter[displayCount]);
	}
    
    //method to sort each input into the correct part of the array//
    public void increaseArray( double salary, int arrayCounter [] )
	{
	    if (salary >= 1000.00)
	    {
	            arrayCounter[8]++;
	        } 
	    		else if (salary >= 900.00)
	        {
	    			arrayCounter[7]++;
	        }
	    		else if (salary >= 800.00)
	        {
	    			arrayCounter[6]++;
	        }
	    		else if (salary >= 700.00)
	        {
	    			arrayCounter[5]++;
	        }
	    		else if (salary >= 600.00)
	        {
	    			arrayCounter[4]++;
	        }
	    		else if (salary >= 500.00)
	        {
	    			arrayCounter[3]++;
	        }
	    		else if (salary >= 400.00)
	        {
	    			arrayCounter[2]++;
	        } 
	    		else if (salary >= 300.00)
	        {
	    			arrayCounter[1]++;
	        } 
	    		else if (salary >= 200.00)
	        {
	    			arrayCounter[0]++;

	        }

    }
    	//Method to receive input from the user, and utilize//
    	//the other methods.//
	    public void salesMethod()
	    {
	    int arrayCounter[] = new int [ 9 ];
	    int salesGross;
	    double salary = 0.0;

	    Scanner amount = new Scanner( System.in );
	    
	    System.out.printf( "How much did they gross? To quit type -1 ");
	    salesGross = amount.nextInt();

	    while ( salesGross >= 0 )
	    {
	        salary = getSalary( salesGross );
	        increaseArray( salary, arrayCounter );
	 
	        System.out.printf( "How much did they gross? To quit type -1 ");
	        salesGross = amount.nextInt();
	    }

	    displayMessage(arrayCounter);
	    amount.close();
	    
	    }

	}
