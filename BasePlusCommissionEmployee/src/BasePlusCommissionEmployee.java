//Calvin M LaClair//

public class BasePlusCommissionEmployee
{

	public CommissionEmployee commissionEmployee; 
	public double baseSalary; 

	public  BasePlusCommissionEmployee( String firstName, String lastName, 
			String socialSecurityNumber, double grossSales, double commissionRate, double salary )
	{
		commissionEmployee = new CommissionEmployee( firstName, lastName, socialSecurityNumber, grossSales, commissionRate );
		setBaseSalary( salary ); 
	} 

	public void setFirstName( String firstName )
	{
		commissionEmployee.setFirstName( firstName );
	} 

	public String getFirstName()
	{
		return commissionEmployee.getFirstName();
	} 

	public void setLastName( String lastName )
	{
		commissionEmployee.setLastName( lastName );
	}

	public String getLastName()
	{
		return commissionEmployee.getLastName();
	} 

	public void setSocialSecurityNumber( String socialSecurityNumber )
	{
		commissionEmployee.setSocialSecurityNumber( socialSecurityNumber );
	} 

	public String getSocialSecurityNumber()
	{
		return commissionEmployee.getSocialSecurityNumber();
	} 

	public void setGrossSales( double grossSales )
	{
		commissionEmployee.setGrossSales( grossSales );
	} 

	public double getGrossSales()
	{
		return commissionEmployee.getGrossSales();
	} 

	public void setCommissionRate( double rate )
	{
		commissionEmployee.setCommissionRate( rate );
	} 
	
	public 	double getCommissionRate()
    {
		return commissionEmployee.getCommissionRate();
	} 
	
	public void setBaseSalary( double salary )
    {
	    baseSalary = ( salary < 0.0	 ) ? 0.0 : salary;
	}
	
	public double getBaseSalary()
	{
		return baseSalary;
	} 
	
	public double earnings()
    {		
		return getBaseSalary() + commissionEmployee.earnings();
	} 
	
	public String toString()
	{
		return String.format( "%s %s\n%s: %.2f", "base-salaried", commissionEmployee.toString(), "base salary", getBaseSalary() );
	} 
}