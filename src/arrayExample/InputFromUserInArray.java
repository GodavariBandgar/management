package arrayExample;

import java.util.Scanner;

public class InputFromUserInArray {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of array");
		
		Scanner sc=new Scanner (System.in);
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("printing of array elements by using normal for loop");
		int length= arr.length;
		
		for(int i=0; i<size;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Array elements using foreach loop");
		
		for(int a:arr) {
			System.out.println(a);
		}
		
		
		
	
		
		}
		
		
	}


