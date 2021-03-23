/**
 * 
 */
package q1;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Mayuresh
#########################
Author: Mayuresh_Sonar
PRN: 055
Group No: 05
Date of Creation: 11-03-2021
#########################
 */
public class PrintInfix {

	/**
	 * @param args
	 */
	/*static boolean isOperand(char x) 
	{ 
	    return (x >= 'a' && x <= 'z') || 
	            (x >= 'A' && x <= 'Z');
	          
	} */

	@SuppressWarnings("unused")
	static String getInfix(String exp) 
	{ 
	    Stack<String> s = new Stack<String>(); 
	  
	    for (int i = 0; i < exp.length(); i++) 
	    { 
	        // Push operands 
	        if (true)//(isOperand(exp.charAt(i))) 
	        { 
	        s.push(exp.charAt(i) + ""); 
	        } 
 
	        else
	        { 
	            String op1 = s.peek(); 
	            s.pop(); 
	            String op2 = s.peek(); 
	            s.pop(); 
	            s.push("(" + op2 + exp.charAt(i) + 
	                    op1 + ")"); 
	        } 
	    } 
	  
	    
	    return s.peek(); 
	} 
	  
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp;
		Scanner instr=new Scanner(System.in);
		System.out.println("Enter a Expression");
		exp=instr.nextLine();
 
		    System.out.println( getInfix(exp)); 

	}

}
