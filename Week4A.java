/**
 * 
 * @author Marcus
 * created: 2.10.20
 * description: This program calculates the BMI of 3 different users.
 *
 */
 import java.util.Scanner;
public class Week4A {
	public static void main(String[]args) {
		System.out.println("Welcome I can calculate three users BMI");
		System.out.println("First person, what is your name?");
		Scanner Keyboard = new Scanner(System.in);
		String name1; 
		name1 = Keyboard.next();
		System.out.println("What is your weight?");
		double weight1  = Keyboard.nextInt();
		System.out.println("What is your height in inches?");
		double height1  = Keyboard.nextInt();
		double BMI1 = weight1/(height1*height1)*703;
		System.out.println(name1 + " Your BMI is " + BMI1);
		
		System.out.println("Next person, what is your name?");
		
		String name2; 
		name2 = Keyboard.next();
		System.out.println("What is your weight?");
		double weight2  = Keyboard.nextInt();
		System.out.println("What is your height in inches?");
		double height2  = Keyboard.nextInt();
		double BMI2 = weight2/(height2*height1)*703;
		System.out.println(name2 + " Your BMI is " + BMI2);
		
		System.out.println("Last person, what is your name?");
		
		String name3; 
		name3 = Keyboard.next();
		System.out.println("What is your weight?");
		double weight3  = Keyboard.nextInt();
		System.out.println("What is your height in inches?");
		double height3  = Keyboard.nextInt();
		double BMI3 = weight1/(height3*height3)*703;
		System.out.println(name3 + " Your BMI is " + BMI3);
		
	}

}
