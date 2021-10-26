package ConsoleHangman.src;
import cs102.*;

import java.util.Scanner;

/**
 * ConsoleHangmanOld: Uses traditional input 
 *
 * @author Izaan Aamir
 * @version 1.00 16/7/2021
 */

public class ConsoleHangmanOld
{
    public static void main( String[] args)
	{
    	Scanner scan = new Scanner( System.in);

    	System.out.println( "Start of ConsoleHangman\n");

		// VARIABLES
		Hangman	hangman;
		int letterOccurance;

		// PROGRAM CODE
		hangman = new Hangman( new BasicSetup() );

		System.out.println( hangman.getKnownSoFar() );
            do{
                System.out.println("Please enter a letter: ");
                String letter = scan.next();
                if ( letter.length() != 1) {
                    System.out.println( "ERROR! Please enter a single letter.");
                }
                else{
                    letterOccurance = hangman.tryThis(letter.charAt(0));
                    if(letterOccurance == 0){
                        System.out.println("The letter you guessed is not in the word.");
                        System.out.println("Used Letters so far are: " + hangman.getUsedLetters());
                        System.out.println("You have " + hangman.getNumOfIncorrectTries() + "/" + hangman.getMaxAllowedIncorrectTries() + " attempts left");
                    }
                    else if(letterOccurance > 0){
                        System.out.println("The word known so far: " + hangman.getKnownSoFar());
                    }
                    else if(letterOccurance == -1){
                        System.out.println("Please enter a valid letter");

                    }
                    else if(letterOccurance == -2){
                        System.out.println("This letter is already used");

                    }
                }
            } while (!hangman.isGameOver());

			if (hangman.hasLost()){

                System.out.println("Sorry, but you lost the game.");
                
            }
            else {
                System.out.println("Congrats, you won the game.");
            }

		// ToDo - allow user to repeatedly enter a letter and tryThis letter
		//		  then show game status, until gameover. Finally report win/lose.


		System.out.println( "\nEnd of ConsoleHangman\n" );
		scan.close();
	}

} // end of class ConsoleHangman
