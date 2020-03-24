//Calvin LaClair Testing application//
import java.util.Scanner;


public class HugeIntTest 
{
	public static void main(String[] args) 
	{
		String HugeInt1="",HugeInt2="";
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first HugeInteger:");

		HugeInt1 = input.next();

		System.out.println("What is the second HugeInteger:");

		HugeInt2 = input.next();

		HugeInteger printInt1 = new HugeInteger(HugeInt1);
		HugeInteger printInt2 = new HugeInteger(HugeInt2);
		System.out.println(printInt1.toString());
		System.out.println(printInt2.toString());
		System.out.println("for isEqualTo: " + HugeInteger.isEqualTo(printInt1,printInt2));
		System.out.println("for isNotEqualTo: " + HugeInteger.isNotEqualTo(printInt1,printInt2));
		System.out.println("for isGreaterThan: " + HugeInteger.isGreaterThan(printInt1,printInt2));
		System.out.println("for isLessThan: " + HugeInteger.isLessThan(printInt1,printInt2));
		System.out.println("for isGreaterThanOrEqualTo: " + HugeInteger.isGreaterThanOrEqualTo(printInt1,printInt2));
		System.out.println("for isLessThanOrEqualTo: " + HugeInteger.isLessThanOrEqualTo(printInt1,printInt2));
		System.out.println("for isZero: " + HugeInteger.isZero(printInt1));
		System.out.println("\n");
		System.out.println(printInt1.toString());
		System.out.println(printInt2.toString());
		System.out.println("with Addition:\n");
		System.out.println( (HugeInteger.add(printInt1,printInt2)).toString() );
		System.out.println("\n");
		System.out.println(printInt1.toString());
		System.out.println(printInt2.toString());
		System.out.println("with Subtraction:\n");
		HugeInteger difference = HugeInteger.subtract(printInt1,printInt2);
		if(difference == null)
			System.out.println("You will not get a positive number doing this...");
		else {
			System.out.println( difference.toString() );
			 }
		input.close();
	}
}


