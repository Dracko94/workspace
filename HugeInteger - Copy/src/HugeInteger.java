/**
 * 
 */



public class HugeInteger {
	  private int[] intArray;
	  private int numDigits;  // stores the number of digits in intArray
	 
	  public HugeInteger(String s)
	  {
	    intArray = new int[40];
	    numDigits = 0;
	    for(int j=0;j<40;j++){
			 intArray[j] = 0;//initialize intArray with Zeros
		 }
	    parse(s);
	  }
	 
	  public HugeInteger( )
	  {
	    intArray = new int[40];
	    numDigits = 0;
		for(int j=0;j<40;j++){
			 intArray[j] = 0;//initialize intArray with Zeros
		 }
	  }
	 
	  public void parse(String s)
	  {
	     // Add each digit to the arrays starting from right to left
	     // update numDigits
		 int arrayindex = 39; 
		 for(int i=s.length()-1;i>=0;i--){
			 intArray[arrayindex] = Character.getNumericValue(s.charAt(i));// Add digit to the array
			 arrayindex--;
			 numDigits++;// update numDigits
		 }
	  }
	 
	  public static HugeInteger add(HugeInteger hugeInt1, HugeInteger hugeInt2)
	  {
	     // Create hugeInt3
	     // Loop
	     //    Add digits from hugeInt1 and hugeInt2,
	     //    Store in corresponding hugeInt3
	     // End
	     //
	     // return hugeInt3
		  HugeInteger hugeInt3 = new HugeInteger();//Hugeinteger object to hold the final sum
		  int remainder = 0;//remainder value goes here if sum of two digits is greater than 9
		  int sum = 0;//sum of two digits goes here
		  for(int i=39;i>=0;i--){
			  sum = hugeInt1.intArray[i]+hugeInt2.intArray[i]+remainder;//sum of two digits starting from right to left
			  remainder = sum/10;//calculate remainder(if any)
			  sum = sum%10;//calculate sum of two digits
			  hugeInt3.intArray[i] = sum;//assign sum to resultant object intArray - from right to left
		  }
		  return hugeInt3;
	  }
	 
	  public static HugeInteger subtract(HugeInteger hugeInt1, HugeInteger hugeInt2)
	  {
	     // Create hugeInt3
	     // Loop
	     //    Subtract hugeInt2 digit from  hugeInt1,
	     //    Store in corresponding hugeInt3
	     // End
	     //
	     // return hugeInt3
		  int Int1, Int2;//holds each digit from two hugeinteger arrays
		  Boolean borrowflag = false;//Set this flag to true if borrow is taken during subtraction
		  HugeInteger hugeInt3 = new HugeInteger();//This will hold the Difference result of two hugeintegers
		  if(!isLessThan(hugeInt1,hugeInt2)){//First check if subtraction is even possible. meaning first number should be greater or equal to second number
		  for(int i=39;i>=0;i--){
			  if(borrowflag){//if borrow flag is true then we need to decrement current digit of hugeinteger1 intArray
				  Int1 = hugeInt1.intArray[i]-1;
				  Int2 = hugeInt2.intArray[i];
				  borrowflag = false;//reset borrow flag
			  }
			  else{
				  Int1 = hugeInt1.intArray[i];
				  Int2 = hugeInt2.intArray[i];
			  }
			  if(hugeInt1.intArray[i]<hugeInt2.intArray[i]){//if digit of hugeInt1 array is less than digit of hugeInt2 array then there is a need to take borrow
				  Int1 = Int1+10;
				  borrowflag = true;//borrow taken from leftmost digit
			  }
			  hugeInt3.intArray[i] = Int1-Int2;//subtract two digits
		  }
		  }
		  else {
			return null;//returns null is first number is less than second
		}
		  return hugeInt3;
	  }
	 
	  public static boolean isEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2)
	  {
	    // return true if the value represented by
	    // elements of hugeInt1.intArray is equal to
	    // value represented by elements of hughInt2.intArray
		for(int i=0;i<40;i++){
			if(hugeInt1.intArray[i] != hugeInt2.intArray[i])//comparing digit-wise both hugeinteger arrays, if there is a mismatch found with any corresponding digits then return false immediately
				return false;
		}
		return true;
	  }
	  
	  public static boolean isNotEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2)
	  {
	    // return true if the value represented by
	    // elements of hugeInt1.intArray is not equal to
	    // value represented by elements of hughInt2.intArray
		  for(int i=0;i<40;i++){
				if(hugeInt1.intArray[i] != hugeInt2.intArray[i])//opposite of isEqualTo
					return true;
			}
			return false;
	  }
	  
	  public static boolean isGreaterThan(HugeInteger hugeInt1, HugeInteger hugeInt2)
	  {
	    // return true if the value represented by
	    // elements of hugeInt1.intArray is greater than
	    // value represented by elements of hughInt2.intArray
		if (hugeInt1.numDigits>hugeInt2.numDigits)
			return true;//if number of digits of first hugeinteger is greater than second hugeinteger then first one is greater
		else if (hugeInt1.numDigits == hugeInt2.numDigits){
			//if number of digits of both hugeinteger arrays are same then we need to compare digit by digit both arrays
			for(int i=0;i<40;i++){
				if(hugeInt1.intArray[i]>hugeInt2.intArray[i])
					return true;//returns true if any first number digit is greater than second number digit
				if(hugeInt1.intArray[i]<hugeInt2.intArray[i])
					return false;
			}
		}
		return false;
	  }
	  
	  public static boolean isLessThan(HugeInteger hugeInt1, HugeInteger hugeInt2)
	  {
	    // return true if the value represented by
	    // elements of hugeInt1.intArray is less than
	    // value represented by elements of hughInt2.intArray
		  if (hugeInt1.numDigits<hugeInt2.numDigits)
				return true;//opposite of isGreaterThan
			else if (hugeInt1.numDigits == hugeInt2.numDigits){
				//opposite of isGreaterThan
				for(int i=0;i<40;i++){
					if(hugeInt1.intArray[i]>hugeInt2.intArray[i])
						return false;//opposite of isGreaterThan
					if(hugeInt1.intArray[i]<hugeInt2.intArray[i])
						return true;
				}
			}
		  return false;  
	  }
	  
	  public static boolean isGreaterThanOrEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2)
	  {
	    // return true if the value represented by
	    // elements of hugeInt1.intArray is greater than or equal to
	    // value represented by elements of hughInt2.intArray
		  if (hugeInt1.numDigits>hugeInt2.numDigits)
				return true;//same as isGreaterThan
			else if (hugeInt1.numDigits == hugeInt2.numDigits){
				//same as isGreaterThan
				for(int i=0;i<40;i++){
					if(hugeInt1.intArray[i]>hugeInt2.intArray[i])
						return true;//same as isGreaterThan
					if(hugeInt1.intArray[i]<hugeInt2.intArray[i])
						return false;
				}
			}
		  return true;//this statement will only executes if two numbers are equal
	  }
	  
	  public static boolean isLessThanOrEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2)
	  {
	    // return true if the value represented by
	    // elements of hugeInt1.intArray is less than
	    // value represented by elements of hughInt2.intArray
		  if (hugeInt1.numDigits<hugeInt2.numDigits)
				return true;//same as isLessThan
			else if (hugeInt1.numDigits == hugeInt2.numDigits){
				//same as isLessThan
				for(int i=0;i<40;i++){
					if(hugeInt1.intArray[i]>hugeInt2.intArray[i])
						return false;//same as isLessThan
					if(hugeInt1.intArray[i]<hugeInt2.intArray[i])
						return true;
				}
			}
		  return true;//this statement will only executes if two numbers are equal
	  }
	  
	  public static boolean isZero(HugeInteger hugeInt1 )
	  {
	    // return true if the value represented by
	    // elements of hugeInt1.intArray is 0
		for(int i=0;i<40;i++){
			if(hugeInt1.intArray[i] != 0)
				return false;//if any of the digit of hugeinteger is not zero then return false immediately
		}
		return true;//number is zero
	  }
	  
	  public String toString()
	  {
	     // return string representation of this object
		 String result = "";
		 for(int i=0;i<40;i++){
			 result+=String.valueOf(this.intArray[i]);//pick each integer from intArray and concatenate it with previous ones as string
		 }
		 return result;
	  }
	  
}
