package ConsoleHangman.src;

import java.util.Scanner;
/**
 * ConsoleHangman: Main Class to test the MVC architecture
 *
 * @author Izaan Aamir
 * @version 1.00 16/07/2021
 */

public class ConsoleHangman
{
    public static void main( String[] args)
	{
    	Scanner scan = new Scanner( System.in);

    	System.out.println( "Start of ConsoleHangman\n");

		// VARIABLES
		HangmanModel hangman;

		// PROGRAM CODE
		hangman = new HangmanModel( new BasicSetup() );
		hangman.addView(new ConsoleHangmanView());
		//hangman.addView(new ConsoleHangmanView());

		System.out.println( hangman.getKnownSoFar() );
		
		while (!hangman.isGameOver()) {
			System.out.println("Please enter a letter");
			String letter = scan.next();
			hangman.tryThis(letter.charAt(0));
		}
		System.out.println( "\nEnd of ConsoleHangman\n" );
		scan.close();
	}

} // end of class ConsoleHangman
