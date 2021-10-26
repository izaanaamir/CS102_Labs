//class which extends JPanel to add labels and acts as a Hangman View

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

import cs102.Hangman;

public class LabelsHangmanView extends JPanel implements IHangmanView{

    //properties
    JLabel usedLetters;
    JLabel incorrectTries;
    JLabel hasLost;
    JLabel knownSoFar;

    //Constant
    private static final Font font = new Font("Serif", Font.BOLD, 18);

    //constructor
    public LabelsHangmanView(){
        super();
        usedLetters = new JLabel("");
        incorrectTries = new JLabel("");
        hasLost = new JLabel("");
        knownSoFar = new JLabel("");
        usedLetters.setFont(font);
        incorrectTries.setFont(font);
        hasLost.setFont(font);
        knownSoFar.setFont(font);
        add(usedLetters);
        add(incorrectTries);
        add(hasLost);
        add(knownSoFar);
        setBackground(Color.gray);
        setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        setPreferredSize(new Dimension(200,200));

    }

    /**
	* updates the view
	* @param hangman
	*/
    @Override
    public void updateView(Hangman hangmanModel) {
        if(!hangmanModel.isGameOver()){
            usedLetters.setText(hangmanModel.getUsedLetters());
            incorrectTries.setText(hangmanModel.getNumOfIncorrectTries()+"/6"); 
            knownSoFar.setText(hangmanModel.getKnownSoFar()); 

        }
        else if(hangmanModel.hasLost()){
                usedLetters.setText("");
                incorrectTries.setText(hangmanModel.getNumOfIncorrectTries()+""); 
                hasLost.setText("You Lost!"); 
                knownSoFar.setText(""); 
            }
        else{
            hasLost.setText("You won"); 
            knownSoFar.setText(hangmanModel.getKnownSoFar()); 
        }
        
    }
    
}
