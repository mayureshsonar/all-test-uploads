/**
 * 
 */
package q2;

/**
 * @author Mayuresh
 *
 */
public class Pattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		 for(i=1;i<=6;i++)
		{ 
		if(i%2!=0)
		 { 
		for(j=1;j<6;j++)
		System.out.print(i);
		 System.out.print(i+1);
		 } if(i%2==0)
		 
		{ System.out.print(i+1);
		 for(j=1;j<6;j++)
		System.out.print(i);
		 
		 }
		 System.out.println();
		}
	
	}

}
