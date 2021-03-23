/**
 * 
 */
package q2;

import java.util.Scanner;

/**
 * @author Mayuresh
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                          }
                 }
         } 
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements to array");
		for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
		   System.out.println("Array Before Bubble Sort");  
           for(int i=0; i < arr.length; i++){  
                   System.out.print(arr[i] + " ");  
           }  
           System.out.println();  
             
           bubbleSort(arr);  
            
           System.out.println("Array After Bubble Sort");  
           for(int i=0; i < arr.length; i++){  
                   System.out.print(arr[i] + " ");  
           }
	}

}
