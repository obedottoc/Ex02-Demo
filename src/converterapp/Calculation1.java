/**
 * Application for area and length conversion
 * 
 * developed by
 * obedotto@saveetha.ac.in
 * 
 * 
 */
package converterapp;

import java.util.Scanner;
import converterlibrary.*;

public class Calculation1 {

	public static void main(String[] args) {
		double value1,value2;
		int option;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. Squarefeet to ground conversion");
			System.out.println("2. Ground to Squarefeet conversion");
			System.out.println("3. Mills to Inch conversion");
			System.out.println("4. Inch to Mills conversion");
			System.out.println("5. Exit");
			System.out.print("Enter your choice:");
			
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.print("Enter area in square feet:");
				value1=sc.nextDouble();
				value2=AreaConverter.squareFeetToGround(value1);
				System.out.printf("%.2f square feet is equal to %.2f ground.\n", value1,value2);
				break;
			case 2:
				break;	
			case 5:
				System.out.println("Thankyou for using converter application !!!");
				break;
			default:
				System.out.print("Please enter a valid number !!!");
			}
			
			if(option==5)
			{		
				break;
			}
		}

	}

}
