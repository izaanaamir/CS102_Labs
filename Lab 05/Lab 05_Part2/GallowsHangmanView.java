//class which extends JPanel and adds it as a view on the JFrame

import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

import cs102.Hangman;

public class GallowsHangmanView extends JPanel implements IHangmanView{

    //properties
    Hangman hangman;
    Line2D.Double[] hangmanBody;
    final static int X= 50,Y=100, WIDTH=200, HEIGHT=200;; 

    //constructor
    public GallowsHangmanView(Hangman hangman){
        this.hangman = hangman;
        setPreferredSize(new Dimension(500,500));
        setBackground(Color.ORANGE);
    }

    /**
	* updates the view
	* @param hangman
	*/
    @Override
    public void updateView(Hangman hangmanModel) {
        repaint(); //repaints the paintComponent
    }
    
    /**
	* paintComponent
	* @param graphics
	*/
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        hangmanBody = new Line2D.Double[5]; // creates array of Line2D
        hangmanBody[0] = new Line2D.Double(WIDTH+40, HEIGHT+10, WIDTH+40, HEIGHT+100);//adds body
        hangmanBody[1] = new Line2D.Double(WIDTH+40, HEIGHT+30, WIDTH+20, HEIGHT+50);//adds arm
        hangmanBody[2] = new Line2D.Double(WIDTH+40, HEIGHT+30, WIDTH+60, HEIGHT+50);//adds arm
        hangmanBody[3] = new Line2D.Double(WIDTH+40, HEIGHT+100, WIDTH+20, HEIGHT+120);// adds leg
        hangmanBody[4] = new Line2D.Double(WIDTH+40, HEIGHT+100, WIDTH+60, HEIGHT+120);// adds leg

        //creates Gallow
        g2.fillRect(X, Y, 20,400 );
        g2.fillRect(X-40, Y+370, 100, 500);
        g2.fillRect(X, 100, Y+100, 20);
        g2.fillRect(X+180, Y+20, 20, 40);

        //repaints the hangman based on number of incorrect tries
        if (hangman.getNumOfIncorrectTries() >= 1) {
            g2.drawOval(215, 160, 50, 50); // draws head
        }
        if (hangman.getNumOfIncorrectTries() >1) {
            for (int i = 0; i < hangman.getNumOfIncorrectTries()-1; i++) {
                g2.draw(hangmanBody[i]); // draws body      
            }
    
        }
    }
}
