/**
 * 
 */
package loopq1;

import java.util.Scanner;

/**
 * @author Mayuresh
#########################
Author: Mayuresh_Sonar
PRN: 055
Group No: 05
Date of Creation: 08-03-2021
#########################
 */
public class SumDemo {

	/**
	 * @param args
	 */

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int i=0;
			int y=0;
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the 10 numbers to be summed");
			while(i<10)
			{
				int x=sc.nextInt();
				y=y+x;
				i++;
			}
			System.out.println("Sum is: "+ y);
		}

	}
