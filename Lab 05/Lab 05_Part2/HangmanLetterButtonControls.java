//class for letter button Controls which implements HangmanView

import java.awt.Dimension;
import java.awt.Font;

import cs102.Hangman;

public class HangmanLetterButtonControls extends LetterButtonControls implements IHangmanView{

    //constructor
    public HangmanLetterButtonControls(Hangman hangman,int r, int c){
        super(hangman.getAllLetters(), r,c);
        setPreferredSize(new Dimension(120,300));
        setFont(new Font("Serif",Font.BOLD,5));
    }

    //methods
    /**
    * updates the view
    * @param hangman
    */
    @Override
    public void updateView(Hangman hangmanModel) {
        setDisabled(hangmanModel.getUsedLetters());
        
        if (hangmanModel.isGameOver()) {
            setEnabledAll(true);
        }
    }
    
}
