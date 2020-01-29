/**
 * 
 * @author Marcus
 * created: 1.29.20
 * description: This program calculates the Birth Year  
 *
 **/
/*  <-
 * multi-line comment this doesn't affect the code
 */
// <- single line comment 
import java.util.Scanner; 
public class FirstProgram {
 
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in); 
		System.out.println("Welcome to My First Program \nThis program displays your birth year");
		System.out.println("What is your age?"); 
		int age  = Keyboard.nextInt();
		
		int birthYear = 2020-age; 
		System.out.println(birthYear + " This is Probably your birth year");
		
	}
}
