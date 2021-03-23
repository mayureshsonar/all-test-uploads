/**
 * 
 */
package ifelseq2;

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
public class IfelseDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		if(x%3==0 && x%7==0) {
			System.out.println("Three-Seven");
		}
		else if(x%3==0) {
			System.out.println("Three");
		}
		else if(x%7==0) {
			System.out.println("Seven");
		}

	}

}
