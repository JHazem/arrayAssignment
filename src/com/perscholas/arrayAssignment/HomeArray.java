package com.perscholas.arrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class HomeArray {

	public static void main(String[] args) {
		 
	}
	
						// 303.3.2 Practice Assignment -Array

	public static void question1() {
		
	/* 1
	Write a program that creates an array of integers with a length of 3. 
	Assign the values 1, 2, and 3 to the indexes. 
	Print out each array element.  */	
		
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);	 
		}
	}
	
	 
	public static void question2() {
	/* 2
	● Write a program that returns the middle element in an array. 
	Give the following values to the integer array: {13, 5, 7, 68, 2} 
	and produce the following output: 7
	*/
		int[] arr = {13, 5, 7, 68, 2};
		if(arr.length % 2 == 0) {
			System.out.println(arr[arr.length/2-1]);
		}else {
			System.out.println(arr[arr.length/2]);
		}
		
	}
	

	public static void question3() {
	/* 3
	● Write a program that creates an array of String type 
	and initializes it with the strings “red”, “green”, “blue” and “yellow”. 
	Print out the array length. 
	Make a copy using the clone( ) method. 
	Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
	*/
	
		String[] arr1= {"red", "green", "blue", "yellow"};
		System.out.println(arr1.length);
		
		String[] arr2= arr1.clone();
		System.out.println(Arrays.toString(arr2));;
	}
	
	
	public static void question4() {

	/* 4
	● Write a program that creates an integer array with 5 elements (i.e., numbers).
	 The numbers can be any integers. 
	 Print out the value at the first index and the last index 
	 using length - 1 as the index. Now try printing the value at index = length 
	 ( e.g., myArray[myArray.length ] ). 
	 Notice the type of exception which is produced. 
	 
	*/
		int[] arr3 = {4, 6, 8, 11, 35};
		System.out.println("The first value at first index is : " +arr3[0]);
		System.out.println("The last value at last index is : " +arr3[arr3.length-1]);
		// Now try to assign a value to the array index 5. You should get the same type of exception.
		arr3[arr3.length]=5; 	
			
		}
	
	public static void question5() {

	/* 5
	● Write a program where you create an integer array with a length of 5. 
	Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding 
	index in the array.
	*/
		Scanner input= new Scanner(System.in);
		int[] arr4 = new int[5];
		for(int i =0; i < arr4.length; i++) {
			System.out.print("Enter value : ");
			arr4[i] = input.nextInt();
		}
		for(int i =0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}
	}
	
	public static void question6() {
	/* 6
	● Write a program where you create an integer array of 5 numbers. 
	Loop through the array and assign the value of the loop control variable multiplied 
	by 2 to the corresponding index in the array.
	*/
		Scanner input= new Scanner(System.in);
		int[] arr5 = new int[5];
		for(int i =0; i < arr5.length; i++) {
			System.out.print("Enter value : ");
			arr5[i] = input.nextInt() * 2;
		}
		for(int i =0; i < arr5.length; i++) {
			System.out.print(arr5[i] + " ");
		}
	}
	
	public static void question7() {
	/* 7
	● Write a program where you create an array of 5 elements. 
	Loop through the array and print the value of each element, 
	except for the middle (index 2) element.
	 */
		int[] arr6 = { 4, 7, 11, 25, 99};
		for(int i =0; i < arr6.length; i++) {
			if(arr6[i] != arr6[2]) {
				System.out.println(arr6[i]);
			
			}
		}
	
	

	}
	
//	public static void question8() {

	/* 8
	Write a program that creates a String array of 5 elements 
	and swaps the first element with the middle element without creating a new array.
	 */
		
//		int[] arr8 = {5, 6, 11, 23, 34};
//		int temp = arr8[0];
//		
//		
//		}
	
	
	
	public static void question9() {

	/* 9
	Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. 
	Print the array in ascending order, and print the smallest and the largest element of the array. 
	The output will look like the following:
	Array in ascending order: 0, 1, 2, 4, 9, 13
	The smallest number is 0
	The biggest number is 13
	*/
		
	int[] arr9= {4, 2, 9, 13, 1, 0};
	for(int i=0; i< arr9.length; i++) {
		for(int j=0; j<arr9.length; j++) {
			if(arr9[i] < arr9[j]) {
				int temp = arr9[i];
				arr9[i] = arr9[j];
				arr9[j] = temp;
			}
		}
	}
	for(int k=0; k<arr9.length; k++) {
		System.out.print(arr9[k] + " ");
	}
	System.out.println();
	System.out.println("The smallest number is : " +arr9[0]);
	System.out.println("The biggest number is : " +arr9[5]);
		
	}
	
	
	public static void question10() {
	/* 10
	Create an array that includes an integer, 3 strings, and 1 double. 
	Print the array.
	 */
	
	
	
	}
	
	
	public static void question11() {
	 /* 11
	Write some Java code that asks the user how many favorite things they have. 
	Based on their answer, you should create a String array of the correct size. 
	Then ask the user to enter the things and store them in the array you created. 
	Finally, print out the contents of the array.
	Example

	How many favorite things do you have?	7
	Enter your thing: phone
	Enter your thing: tv
	Enter your thing: xbox
	Enter your thing: wine
	Enter your thing: beer
	Enter your thing: sofa
	Enter your thing: book
	Your favorite  things are:
	phone tv xbox wine beer sofa book
	*/
	
		Scanner s = new Scanner(System.in);
		System.out.println("How many favorite things do you have? ");
		int favList = s.nextInt();
		String[] myList = new String[favList];
		
		for(int i = 0; i < myList.length; i++ ) {
			System.out.print("Enter your things : ");
			String myFavYhings = s.next();
			myList[i] = myFavYhings;
		}
		for(int i = 0; i < myList.length; i++ ) {
			System.out.print (myList[i] + " ");
		}
	}
	
	
	
}
