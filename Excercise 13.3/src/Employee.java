//Calvin LaClair - Utilizing get/set in order get and set the first
//last and salary.

public	class	Employee
{
	private String 	firstName;
	private	String lastName;
	private	double	monthlySalary;
	
public Employee(String x, String y, double z)
{
	firstName = x;
	lastName = y;
	if	(z < 0)
	{   
	monthlySalary =0;
	}
	else monthlySalary = z;
}

public	String getFirstName()
{
	return firstName;
}

public void setFirstName(String fname)
{
	firstName = fname;
}

public String getLastName() 
{
	return lastName;
}

public void setLastName(String lname) 
{
	lastName = lname;
}

public double getMonthlySalary() 
{
	return monthlySalary;
}

public void setMonthlySalary(double z) 
{
	if (z < 0)
	{
		monthlySalary =0;
	}
	
	else monthlySalary = z;
	}
}