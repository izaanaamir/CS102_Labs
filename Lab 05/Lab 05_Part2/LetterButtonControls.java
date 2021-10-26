import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;

/**
 * LetterButtonControls - keyboard for MVC demo of Hangman, but general.
 *
 * @author Izaan Aamir
 * @version 1.00 18/7/2021
 */
public class LetterButtonControls extends JPanel
{
	//constructor
	public LetterButtonControls( String letters)
	{
		this( letters, 2, 13);
	}

	//second constructor
	public LetterButtonControls( String letters, int rows, int cols)
	{
		setBorder( new TitledBorder("Choose a letter...") );
		setLayout( new GridLayout( rows, cols) );

		for( int i = 0; i < letters.length(); i++) {
			JButton b = new JButton( "" + letters.charAt(i) );
			b.setMargin( new Insets( 1, 2, 1, 2) );
			add( b);
		}
	}

	/**
	* adds listener to all the buttons
	* @param actionlistener
	*/
	public void addActionListener( ActionListener l )
	{
		Component[] buttons = getComponents();
		for ( Component b : buttons )
		{
			( (JButton) b).addActionListener( l);
		}
	}

	/**
	* enables all buttons
	* @param state
	*/
	public void setEnabledAll( boolean state)
	{
		for ( Component c : getComponents() ) {
			((JButton) c).setEnabled( state);
		}
	}

	/**
	* dsiables used buttons
	* @param letters
	*/
	public void setDisabled( String letters)
	{
		for ( Component c : getComponents() ) {
			char ch = ((JButton) c).getText().charAt(0);
			if ( letters.indexOf(ch) >= 0)
				((JButton) c).setEnabled( false);
		}
	}

	
}