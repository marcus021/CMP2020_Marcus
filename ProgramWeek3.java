

/**
 * 
 * @author Marcus
 * created: 2.5.19
 * description: This program calculates the product of any three numbers. 
 */

import java.util.Scanner;

public class ProgramWeek3 {
	
	public static void main(String []args) {
	
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.println("Welcome I will multiply any three numbers that you give me.");
		System.out.println("What is your first number?");
		int number1 = Keyboard.nextInt();
		
		System.out.println("What is your second number?");
		int number2 = Keyboard.nextInt();
		
		System.out.println("What is your final number?");
		int number3 = Keyboard.nextInt();
		
		int Product = number1*number2*number3;
		System.out.println("This is the product\n " + Product);
		
		
		
	}
}
