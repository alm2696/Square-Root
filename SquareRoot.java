package asgn6;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		DecimalFormat g =new DecimalFormat("#.##");
		
		Scanner input = new Scanner(System.in);
		
		double n;
		double guess;
		double r;
		double oldGuess;
		double error=Double.MAX_VALUE;
		
		System.out.print("Enter a number: ");
		n = input.nextDouble();
		guess=n/2;
		
		do {                        
	        r = n / guess;
	        oldGuess=guess;
	        guess = (guess + r) / 2;
	        error = ((guess-oldGuess)/oldGuess);
	    } while (Math.abs(error) > 0.01);
		System.out.println("The square root of " + n +" is " +g.format(guess));
		input.close();
	}

}
