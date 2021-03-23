/**
 * 
 */
package loopq2;

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
public class CountDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int count1=0;
		int count2=0;
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 10 numbers");
		while(i<10)
		{
			int x=sc.nextInt();
			if(x<0)
			{
				count++;
			}
			else if(x>0)
			{
				count1++;
			}
			else
			{
				count2++;
			}
			i++;
		}
		System.out.println("There are no of Positive no's : "+count1);
		System.out.println("There are no of Negative no's :"+count);
		System.out.println("There are no of Zero no's :"+count2);
	}


}
