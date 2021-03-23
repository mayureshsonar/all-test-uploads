/**
 * 
 */
package q1;

/**
 * @author Mayuresh
 *
 */
public class Special {

	/**
	 * @param args
	 */
	static int isSpecial(int arg) 
	{
		// TODO Auto-generated method stub
	    int sum = 0, temp, count, fact;
	    temp = arg;
	    while(temp != 0)
	    {
	        fact = 1;
	        for(count = 1; count <= temp%10; count++)
	        {
	            fact = fact * count;
	        }
	        sum = sum + fact;
	        temp = temp/10;
	    }
	    if (sum == arg) 
	    {
	        return 1;
	    }
	    else 
	    {
	        return 0;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  count;
		  for(count = 1; count <= 20000; count++)
		    {
		        if(isSpecial(count) == 1 )
		        {
		            System.out.println(count);
		        }
		    }
		   
		}

}
