package ConsoleHangman.src;
import cs102.*;

import java.util.ArrayList;

//subclass of hangman which adds and updates the views
public class HangmanModel extends Hangman {

    //variables
    ArrayList<IHangmanView> views = new ArrayList<IHangmanView>();

    //constructor
    public HangmanModel(IHangmanSetup setup) {
        super(setup);
    }

    //methods
    /**adds view
     * @param IHangmanView
     */
    public void addView(IHangmanView view) {
        views.add(view);
    }
    
    /**calls the updateView method
     */
    public void update(){
        for (int i = 0; i < views.size(); i++) {
            views.get(i).updateView(this);
        }
    }

    /**overrides tryThis and adds update method to it
     * @param final char
     * @return int 
     */
    @Override
    public int tryThis(final char letter){
        int letterOccurance = super.tryThis(letter);
        this.update();
        return letterOccurance;
    }
}
