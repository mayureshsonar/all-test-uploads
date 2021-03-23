/**
 * 
 */
package ifelseq1;

import java.util.Scanner;

/**
 * @author Mayuresh
 * 
#########################
Author: Mayuresh_Sonar
PRN: 055
Group No: 05
Date of Creation: 08-03-2021
#########################
 *
 */
public class Swaping {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value for x: ");
		int x = sc.nextInt();
		System.out.println("Enter value for y: ");
		int y = sc.nextInt();
		
		x= x+y;
		y= x-y;
		x= x-y;
		System.out.println("After Swaping: " + "x= "+ x + " y= "+ y);
		
	}

}
