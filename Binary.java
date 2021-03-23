/**
 * 
 */
package q1;

import java.util.Scanner;

/**
 * @author Mayuresh
 * 
 * 
 *
 */
public class Binary {

	/**
	 * @param args
	 */
    static int find(int number)
    {
        if (number == 0) 
            return 0; 
             
        else
         
        return (number % 2 + 10 * 
                find(number / 2));
    }
    
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		 int number= sc.nextInt();
		    System.out.println(find(number));

	}

}
