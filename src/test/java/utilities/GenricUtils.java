package utilities;

import java.util.Random;


 public class GenricUtils {
	 static StringBuilder randombatchname;
	public static boolean isNumeric(String strNum)
	{
	    if (strNum == null) 
	    {
	        return false;
	    }
	    try 
	    {
	        int d = Integer.parseInt(strNum);
	    } catch (NumberFormatException nfe) 
	    {
	        return false;
	    }
	    return true;
	}
	public static void rndom()
	{
		
		int leftLimit = 97; 
	    int rightLimit = 122; 
	    int targetStringLength = 10;
	    Random random = new Random();
	    randombatchname = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) 
	    {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        randombatchname.append((char)randomLimitedInt);
	        
	}
	}
	 public void GenricUtils(String phonenum)
	    {
	        int num1, num2, num3; 
	        int set2, set3;  
	        Random generator = new Random();
	        num1 = generator.nextInt(7) + 1;   
	        num2 = generator.nextInt(8); 
	        num3 = generator.nextInt(8);
	        set2 = generator.nextInt(643) + 100;
	        set3 = generator.nextInt(8999) + 1000;
	        String phonenumber1 = num1 + "" + num2 + "" + num3 + ")" + "-" + set2 + "-" + set3;
	        // System.out.println (phonenumber1 );       
	    }
}


