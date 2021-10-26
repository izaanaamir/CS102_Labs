import cs102.Hangman;
import java.util.Scanner;

// ConsoleControl
// Izaan 18/7/2021

public class ConsoleControl
{
	public static void controlFor( Hangman hangman)
	{
		Scanner scan = new Scanner( System.in);

		char	letter;

		do
		{
			System.out.print( "Enter letter: ");
			letter = scan.next().charAt(0);

			System.out.println( "found " + hangman.tryThis( letter) + " occurances.");
			System.out.println();

		} while ( !hangman.isGameOver()); 
		scan.close(); 
	}

}
