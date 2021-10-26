//class which extends JButton for the New Game and acts as a HangmanView

import javax.swing.JButton;
import java.awt.event.*;

import cs102.Hangman;


public class NewGameButtonControl extends JButton implements IHangmanView{
    
    //properties
    Hangman hangman;

    //constructor
    public NewGameButtonControl(Hangman hangman){
        super("New Game");
        this.hangman=hangman;
        ClickListener listener = new ClickListener();
        addActionListener(listener);
    }


    //inner listener class
    public class ClickListener implements ActionListener{

        /**
        * actionPerformed
        * @param ActionEvent
        */
        @Override
        public void actionPerformed(ActionEvent e) {
            hangman.initNewGame();
            setEnabled(false);
            
        }

    }


    /**
    * updates the view
    * @param hangman
    */
    @Override
    public void updateView(Hangman hangmanModel) {
        if (hangman.isGameOver()) {
            setEnabled(true);
        }
        
    }
}
