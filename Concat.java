/**
 * 
 */
package q4;

import java.util.Scanner;

/**
 * @author Mayuresh
 *
 */
public class Concat {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1, str2;
	      Scanner scan = new Scanner(System.in);
	 
	      System.out.print("Enter First String : ");
	      str1 = scan.nextLine();
	      System.out.print("Enter Second String : ");
	      str2 = scan.nextLine();
	      
	      System.out.print("Appending 1st With Second\n");
	      str1 = str2.concat(str1);
		  
	      System.out.print("String 1 after Concatenation is " +str1);
	}

}
