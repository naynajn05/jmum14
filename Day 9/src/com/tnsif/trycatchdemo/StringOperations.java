package com.tnsif.trycatchdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringOperations {
	public static void main(String[] args) {
		try {	
			Scanner sc = new Scanner(System.in);
			int startIndex, endIndex;
			String message,str;
			System.out.println("Enter the message: ");
			message=sc.nextLine();
			System.out.println("Enter the start index : ");
			startIndex=sc.nextInt();
			System.out.println("Enter the  end index: ");
			endIndex=sc.nextInt();
			str=message.substring(startIndex, endIndex);
			System.out.println("The extracted message is: "+ str);
		
		}catch(StringIndexOutOfBoundsException ae) {
			System.err.println("Error! Invalid index ");
		
		}catch(InputMismatchException ae) {
			System.err.println("Error! Invalid input ");
		}
			
		}

}
