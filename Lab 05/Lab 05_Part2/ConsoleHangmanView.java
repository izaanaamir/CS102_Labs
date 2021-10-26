import cs102.Hangman;
import javax.swing.JPanel;
// ConsoleHangmanView
// Izaan Aamir 18/7/2021

public class ConsoleHangmanView extends JPanel implements IHangmanView
{
	/**
	* updates view
	* @param hangman
	*/
	@Override
	public void updateView( Hangman hangman)
	{
		System.out.println( "[" + hangman.getNumOfIncorrectTries() + "] "
								+ hangman.getKnownSoFar() );

		if ( hangman.isGameOver() )
			if ( hangman.hasLost() )
				System.out.println( "Sorry, you lost!");
			else
				System.out.println( "Congratulations, you won.");
	}
}