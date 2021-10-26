package ConsoleHangman.src;
import cs102.*;

//class which implements interface IHangmanView
public class ConsoleHangmanView implements IHangmanView{


    //methods
    /**updates the view
     * @param Hangman
     */
    public void updateView(Hangman hangmanModel) {
        
        if (hangmanModel.hasLost()){
            System.out.println("Sorry, but you lost the game.");
        }
        else if (hangmanModel.isGameOver()){
            System.out.println("Congratulations. You have won the game");
        }
        else{
            System.out.println("The word known so far: " + hangmanModel.getKnownSoFar());
        }
    }

    
}
