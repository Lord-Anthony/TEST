package Practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		
	Scanner input = new Scanner(System.in);
		
	int num1, num2;
	
	System.out.println("Salary: ");
	num1 = input.nextInt();
	
	System.out.println("Days");
	num2 = input.nextInt();
	
	double Income = num1 * num2;
	double Food = num1 * num2 * 0.5;
	double Items = num1 * num2 * 0.3;
	double Savings = num1 * num2 * 0.2;
	
	System.out.println("Income: " + Income);
	System.out.println("Food: " + Food);
	System.out.println("Items: "+ Items);
	System.out.println("Savings: " + Savings);
			
	
		
		
		

	}

}
