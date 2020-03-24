import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) {
		String HugeInt1="",HugeInt2="";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the first HugeInteger:");
		try {
			HugeInt1 = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Please enter the second HugeInteger:");
		try {
			HugeInt2 = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		HugeInteger HI1 = new HugeInteger(HugeInt1);
		HugeInteger HI2 = new HugeInteger(HugeInt2);
		System.out.println(HI1.toString());
		System.out.println(HI2.toString());
		System.out.println("isEqualTo: "+HugeInteger.isEqualTo(HI1,HI2));
		System.out.println("isNotEqualTo: "+HugeInteger.isNotEqualTo(HI1,HI2));
		System.out.println("isGreaterThan: "+HugeInteger.isGreaterThan(HI1,HI2));
		System.out.println("isLessThan: "+HugeInteger.isLessThan(HI1,HI2));
		System.out.println("isGreaterThanOrEqualTo: "+HugeInteger.isGreaterThanOrEqualTo(HI1,HI2));
		System.out.println("isLessThanOrEqualTo: "+HugeInteger.isLessThanOrEqualTo(HI1,HI2));
		System.out.println("isZero: "+HugeInteger.isZero(HI1));
		System.out.println("\n");
		System.out.println(HI1.toString());
		System.out.println(HI2.toString());
		System.out.println("Addition:\n");
		System.out.println( (HugeInteger.add(HI1,HI2)).toString() );
		System.out.println("\n");
		System.out.println(HI1.toString());
		System.out.println(HI2.toString());
		System.out.println("Subtraction:\n");
		HugeInteger difference = HugeInteger.subtract(HI1,HI2);
		if(difference == null)
			System.out.println("Cannot subtract integers as first number is less than second!");
		else {
			System.out.println( difference.toString() );
		}
	}
}
