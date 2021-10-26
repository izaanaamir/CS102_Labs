//class which extends JPanel and creates a textField

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.Font;

import cs102.Hangman;

public class TextFieldControlPanel extends JPanel{
    
    //properties
    Hangman hangman; 
    JTextField textField;

    //contructor
    public TextFieldControlPanel(Hangman hangman){
        super();
        this.hangman=hangman;
        textField = new JTextField(10);
        textField.setFont(new Font("Serif",Font.BOLD,18));
        add(textField);
        ClickListener listener = new ClickListener();
        textField.addActionListener(listener);
    }

    //inner listener class
    public class ClickListener implements ActionListener{

        /**
        * actionPerformed
        * @param ActionEvent
        */
        @Override
        public void actionPerformed(ActionEvent e) {
        String s = textField.getText();
        hangman.tryThis(s.charAt(0));
        textField.setText(null);
        }
    }

    
}
