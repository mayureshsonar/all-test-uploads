/**
 * 
 */
package q2;

/**
 * @author Mayuresh
 *
 */
public class Pattern2 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,c,k,r,r1;  
		int n = 3;
		c=n-1; 
		for(i=1;i<=n;i++) { 
		for(k=1;k<=c;k++) 
		System.out.print(" "); 
		for(j=1;j<=i;j++) 
		System.out.print(j); 
		for(r=j-2;r>=1;r--) 
		System.out.print(r); 
		System.out.println();
		c=c-1; 
		} 
		c=c+2; for(i=n-1;i>=1;i--) 
		{ 
		for(k=1;k<=c;k++) 
		System.out.print(" "); 
		for(j=1;j<=i;j++) 
		System.out.print(j); 
		for(r1=j-2;r1>=1;r1--) 
		System.out.print(r1); 
		System.out.println(); 
		c=c+1; 
		} 
	}
}
