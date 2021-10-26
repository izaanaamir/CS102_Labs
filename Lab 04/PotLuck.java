import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PotLuck extends JFrame{
    private static final long serialVersionUID = 1L;
    private JButton prizeButton;
    private JButton bombButton1;
    private JButton bombButton2;
    private JButton normalButton;
    private int prizeIndex;
    private int bombIndex1;
    private int bombIndex2;
    private JPanel panel;
    private JPanel buttonPanel;
    private JLabel label;
    private int count;
    private PotLuckListener listener;

    public PotLuck(){
        count = 0;
        creatingComponents();
    }

    public void creatingComponents(){

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0,4));
        listener = new PotLuckListener();
        panel = new JPanel();
        label = new JLabel("Welcome");
        panel.setLayout(new BorderLayout());
        setContentPane(panel);
        panel.add(label, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);
        prizeIndex = (int) (Math.random()*16) +1;
        bombIndex1 = (int) (Math.random()*16) +1;
        bombIndex2 = (int) (Math.random()*16) +1;
        

        while ((prizeIndex == bombIndex1) || (prizeIndex == bombIndex2) || (bombIndex2 == bombIndex1)) {
            bombIndex2 = (int) (Math.random()*16) +1;   
            bombIndex1 = (int) (Math.random()*16) +1;
            prizeIndex = (int) (Math.random()*16) +1;
        }
        System.out.println(prizeIndex);
        System.out.println(bombIndex1);
        System.out.println(bombIndex2);
        for (int i = 1; i <= 16; i++) {
            if (i == prizeIndex) {
                prizeButton = new JButton("" + i);
                prizeButton.addActionListener(listener);
                buttonPanel.add(prizeButton);
            }
            else if (i == bombIndex1){
                bombButton1 = new JButton("" + i);
                bombButton1.addActionListener(listener);
                buttonPanel.add(bombButton1);                
            }
            else if (i == bombIndex2){
                bombButton2 = new JButton("" + i);
                bombButton2.addActionListener(listener);
                buttonPanel.add(bombButton2);
            }
            else{
                normalButton = new JButton("" + i);
                normalButton.addActionListener(listener);
                buttonPanel.add(normalButton);
            }
        }   
    }   

    public void disableAllButtons(){
        for (int i = 0; i < 16; i++) {
                ((JButton) buttonPanel.getComponent(i)).setEnabled(false);
        }
    }

    private class PotLuckListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            if ( e.getSource() == prizeButton){
                label.setText("You got it in " + count + " tries!");
                prizeButton.setText(null);
                bombButton1.setText(null);
                ImageIcon star = new ImageIcon("star.png");
                disableAllButtons();
                prizeButton.setIcon(star);

            }
            else if ( e.getSource() == bombButton1){
                label.setText("Sorry! You are blown up at attempt " + count);
                bombButton1.setText(null);
                ImageIcon bomb = new ImageIcon("bomb1.png");
                disableAllButtons();
                bombButton1.setIcon(bomb);
            }
            else if ( e.getSource() == bombButton2){
                label.setText("Sorry! You are blown up at attempt " + count);
                bombButton2.setText(null);
                ImageIcon bomb = new ImageIcon("bomb1.png");
                disableAllButtons();
                bombButton2.setIcon(bomb);
            }
            else{
                label.setText("You have guessed " + count + " times");
                ((JButton) e.getSource()).setEnabled(false);
            }
        }
    }
}
