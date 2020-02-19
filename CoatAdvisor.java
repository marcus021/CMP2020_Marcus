/**
 * 
 * @author Marcus
 * created: 2.19.20
 * description: This program tells you if you should wear a coat based on if it is too hot, warm, cold, too cold, all depending on the weather that is input.
 *
 */
import java.util.Scanner;
 

public class CoatAdvisor {
public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	
	System.out.println("Welcome to Coat Advisor");
	System.out.println("Enter Weather in fareinheit");
	double weather = kb.nextDouble();
	
	if(weather>70)
		System.out.println("It's hot, don't wear a jacket");
	else if(weather>50)
		System.out.println("It's warm, don't wear a coat");
	else if(weather>30)
		System.out.println("It's cold, wear a jacket");
	else
		System.out.println("It's too cold, wear a coat");
}
} 