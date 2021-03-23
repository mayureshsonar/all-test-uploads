/**
 * 
 */
package q3;

import java.util.Scanner;

/**
 * @author Mayuresh
 *
 */
public class Switch {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your Choice");
		int choice = 0;
		while(choice != 3) {
		System.out.println("1. Square");
		System.out.println("2. Cube");
		System.out.println("3. Exit");
		choice = in.nextInt();
		switch(choice)
		{
		case 1 :
			System.out.println("Enter a number to do square : ");
			int num = in.nextInt();
			System.out.println("Square of " + num + " is " + num*num);
			break;
			
		case 2 :
			System.out.println("Enter a number to do cube : ");
			int num1 = in.nextInt();
			System.out.println("Cube of " + num1 + " is " + num1*num1*num1);
			break;
			
		case 3 :
			System.out.println("Thank You Visit again");
			break;
			
		default:
			System.out.println("Enter correct value ");
			}
		
		}
	}

}
