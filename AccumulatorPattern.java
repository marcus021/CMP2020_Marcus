/**
 * 
 * @author Marcus
 * created 3.2.20
 *
 */
import java.util.Scanner;

public class AccumulatorPattern {
public static void main(String[] args) {

	System.out.println("Eneter the integer that you want to find the factorial of: ");
	Scanner Keyboard = new Scanner(System.in);
	int userInput = Keyboard.nextInt();
	
	
	for(int i=0;i<userInput+1 ; i*=i);
	    int numFact = userInput * 1; 
	    System.out.println("The factorial is "+numFact);
	    
// powerTwo = (2,5);
	

	
}
}