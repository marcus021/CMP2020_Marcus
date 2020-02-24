/** 
 * 
 * @author Marcus
 * Description: This program tell you if the number that you guessed is the number that it was thinking of
 * Created: 02.24.20
 */
import java.util.Scanner;
import java.util.Random;
public class NumberGuess {
	public static void main(String []args) {
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.println(" Welcome I am a number guesser machine I think of a number and you try to guess it.");
		Random random  = new Random();
		
		int compGuess = random.nextInt(20);
		System.out.println("I am thinking of a number between 0 and 20 not including 20 but counting 0 and decimals aren't allowed");
		System.out.println("Guess the number that I am thinking of");
		
		int UserGuess = Keyboard.nextInt();
		
		if(UserGuess == compGuess)
			for(int i = 0; i<3;i ++)
		System.out.println(" Victory");
		else if(UserGuess != compGuess)
			for(int i = 0; i<3;i ++)
		System.out.println(" Game Over!");
}
}
