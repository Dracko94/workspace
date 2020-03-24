//Calvin M LaClair HugeInteger//

public class HugeInteger
{
	  private int[] intArray;
	  private int numArray;
	  
	  public HugeInteger(String s)
	  {
	    intArray = new int[40];
	    numArray = 0;
	    for(int j = 0 ; j < 40;j++)
	    {
			intArray[j] = 0;
		}
	    parse(s);
	  }
	 
	  public HugeInteger()
	  {
	    intArray = new int[40];
	    numArray = 0;
		for(int j = 0 ; j < 40;j++)
		{
			intArray[j] = 0;
		}
	  }
	 
	  public void parse(String s)
	  {

		 int arrayIndex = 39; 
		 for(int i = s.length() -1; i >= 0 ;i--){
			 intArray[arrayIndex] = Character.getNumericValue(s.charAt(i));
			 arrayIndex--;
			 numArray++;
		 }
	  }
	 
	  public static HugeInteger add(HugeInteger hugeInt1, HugeInteger hugeInt2)
	  {
		  HugeInteger hugeIntTemp = new HugeInteger();
		  int remainder = 0;
		  int sum = 0;
		  
		  for(int i=39 ; i >= 0;i--)
		  {
			  sum = hugeInt1.intArray[i] + hugeInt2.intArray[i] + remainder;
			  remainder = sum / 10;
			  sum = sum % 10;
			  hugeIntTemp.intArray[i] = sum;
		  }
		  return hugeIntTemp;
	  }
	 
	  public static HugeInteger subtract(HugeInteger hugeInt1, HugeInteger hugeInt2)
	  {
		  int hugeIntTemp1, hugeIntTemp2;
		  Boolean ableBorrow = false;
		  HugeInteger hugeIntTemp = new HugeInteger();
		  
		  if(!isLessThan(hugeInt1, hugeInt2))
		  {
			  for(int i = 39; i >= 0;i--)
			  {
				  if(ableBorrow)
				  {
					  hugeIntTemp1 = hugeInt1.intArray[i] -1;
					  hugeIntTemp2 = hugeInt2.intArray[i];
					  ableBorrow = false;
				  }
			  
				  else
				  {
					  hugeIntTemp1 = hugeInt1.intArray[i];
					  hugeIntTemp2 = hugeInt2.intArray[i];
				  }
			  
				  if(hugeInt1.intArray[i]<hugeInt2.intArray[i])
				  {
					  hugeIntTemp1 = hugeIntTemp1+10;
					  ableBorrow = true;
				  hugeIntTemp.intArray[i] = hugeIntTemp1-hugeIntTemp2;
				  }
			  }
		  }
		  
		  else 
		  {
			return null;
		  }
			return hugeIntTemp;
	  }
	 
	  public static boolean isEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2)
	  {

		for(int i = 0 ;i < 40;i++){
			if(hugeInt1.intArray[i] != hugeInt2.intArray[i])
				return false;
		}
		return true;
	  }
	  
	  public static boolean isNotEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2)
	  {

		  for(int i = 0; i<40;i++){
				if(hugeInt1.intArray[i] != hugeInt2.intArray[i])
					return true;
			}
			return false;
	  }
	  
	  public static boolean isGreaterThan(HugeInteger hugeInt1, HugeInteger hugeInt2)
	  {
		if (hugeInt1.numArray > hugeInt2.numArray)
			return true;
		else if (hugeInt1.numArray == hugeInt2.numArray)
		{
			for(int i = 0; i < 40;i++)
			{
				if(hugeInt1.intArray[i]>hugeInt2.intArray[i])
					return true;
				if(hugeInt1.intArray[i]<hugeInt2.intArray[i])
					return false;
			}
		}
		return false;
	  }
	  
	  public static boolean isLessThan(HugeInteger hugeInt1, HugeInteger hugeInt2)
	  {
		  if (hugeInt1.numArray < hugeInt2.numArray)
				return true;
			else if (hugeInt1.numArray == hugeInt2.numArray)
			{
				for(int i = 0 ;i < 40;i++)
				{
					if(hugeInt1.intArray[i]>hugeInt2.intArray[i])
						return false;
					if(hugeInt1.intArray[i]<hugeInt2.intArray[i])
						return true;
				}
			}
		  return false;  
	  }
	  
	  public static boolean isGreaterThanOrEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2)
	  {
		  if (hugeInt1.numArray > hugeInt2.numArray)
				return true;
			else if (hugeInt1.numArray == hugeInt2.numArray)
			{
				for(int i = 0; i < 40;i++)
				{
					if(hugeInt1.intArray[i] > hugeInt2.intArray[i])
						return true;
					if(hugeInt1.intArray[i] < hugeInt2.intArray[i])
						return false;
				}
			}
		  return true;
	  }
	  
	  public static boolean isLessThanOrEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2)
	  {
		  if (hugeInt1.numArray < hugeInt2.numArray)
				return true;
			else if (hugeInt1.numArray == hugeInt2.numArray)
			{
				for(int i = 0;i < 40;i++){
					if(hugeInt1.intArray[i] > hugeInt2.intArray[i])
						return false;
					if(hugeInt1.intArray[i] < hugeInt2.intArray[i])
						return true;
				}
			}
		  return true;
	  }
	  
	  public static boolean isZero(HugeInteger hugeInt1 )
	  {
		for(int i = 0;i < 40;i++)
		{
			if(hugeInt1.intArray[i] != 0)
				return false;
		}
		return true;
	  }
	  
	  public String toString()
	  {
		 String result = "";
		 for(int i = 0; i < 40;i++)
		 {
			 result += String.valueOf(this.intArray[i]);
		 }
		 return result;
	  }
	  
}