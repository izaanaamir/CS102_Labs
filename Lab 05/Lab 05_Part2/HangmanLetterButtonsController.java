//class which extends JButton and implements a listener

import java.awt.event.*;
import javax.swing.JButton;

import cs102.Hangman;

public class HangmanLetterButtonsController extends JButton implements ActionListener{

    //properties
    Hangman hangman;
    
    //constructor
    public HangmanLetterButtonsController(Hangman hangman){
        this.hangman = hangman;
    } 
    
    /**
	* action performed method
	* @param ActionEvent
	*/
    @Override
    public void actionPerformed(ActionEvent e) {
        char c = ((JButton) e.getSource()).getText().charAt(0);
        hangman.tryThis(c);
    }
    
}