import javax.swing.*;
import java.awt.event.*; 
import java.awt.*;

public class SOSGUIPanel extends JPanel{
    private SOS game;
    private String p1;
    private String p2;
    private SOSCanvas canvas;
    JPanel panel1;
    String[] typechars = {"S","O"};
    JComboBox<String> combo1;
    
    public SOSGUIPanel(SOS game, String p1, String p2){ 
        this.game = game;
        canvas =new SOSCanvas(game);
        this.p1 = p1;
        this.p2 = p2;
        this.setLayout(new BorderLayout());
        panel1 = new JPanel();
        combo1 = new JComboBox<String>(typechars);
        panel1.add(combo1);
        this.add(panel1, BorderLayout.SOUTH);
        add(canvas, BorderLayout.CENTER);
        SOSListener listener = new SOSListener();
        add(canvas, BorderLayout.CENTER);
        canvas.addMouseListener(listener);
        addMouseListener(listener);
    }   

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        JLabel namelabel1 = new JLabel();
        JLabel namelabel2 = new JLabel();
        JLabel namelabel3 = new JLabel();
        JPanel panel2 = new JPanel();
        if (game.getTurn() == 1) {
            panel2.add(namelabel1);
            panel2.add(namelabel2);
            panel2.add(namelabel3);
            this.add(panel2, BorderLayout.NORTH);
            namelabel1.setText(p1 +" " +  game.getPlayerScore1());
            namelabel1.setForeground(Color.GREEN);
            namelabel2.setText(" - ");
            namelabel3.setText(game.getPlayerScore2() + "  "  +p2);
            namelabel3.setForeground(Color.BLACK);
        }
        else {
            panel2.add(namelabel1);
            panel2.add(namelabel2);
            panel2.add(namelabel3);
            this.add(panel2, BorderLayout.NORTH);
            namelabel1.setText(p1 +" " +  game.getPlayerScore1());
            namelabel1.setForeground(Color.BLACK);
            namelabel2.setText(" - ");
            namelabel3.setText(game.getPlayerScore2() + "  "  +p2);
            namelabel3.setForeground(Color.GREEN);
        }
    }

    
    public class SOSListener extends JPanel implements MouseListener{

        JFrame gameOver = new JFrame();
        public void mouseClicked(MouseEvent e) { 
            for (int i = 0; i <= game.getDimension(); i++) {
                for (int j = 0; j <= game.getDimension(); j++) {
                    if (e.getX() < i*(canvas.totalSize/game.getDimension()) && (e.getX() > (i-1)*(canvas.totalSize/game.getDimension())) && e.getY() < j*(canvas.totalSize/game.getDimension()) && (e.getY() > (j-1)*(canvas.totalSize/game.getDimension()))) {
                        if (combo1.getSelectedItem().toString().equals("S")) {
                            game.play('s', i, j);
                            repaint();
                            System.out.println(game.getPlayerScore1());
                            System.out.println(game.getPlayerScore2());
                            if (game.isGameOver() && (game.getPlayerScore1() > game.getPlayerScore2())) {
                                JOptionPane.showMessageDialog(gameOver, "The winner is " + p1);
                            }
                            else if(game.isGameOver() && (game.getPlayerScore1() < game.getPlayerScore2())){
                                JOptionPane.showMessageDialog(gameOver, "The winner is " + p2);
                            }
                            else if(game.isGameOver() && (game.getPlayerScore1() == game.getPlayerScore2())){
                                JOptionPane.showMessageDialog(gameOver, "It is a draw ");
                            }
                        }
                        else{
                            game.play('o', i, j);
                            repaint();
                            if (game.isGameOver() && (game.getPlayerScore1() > game.getPlayerScore2())) {
                                JOptionPane.showMessageDialog(gameOver, "The winner is " + p1);
                            }
                            else if(game.isGameOver() && (game.getPlayerScore1() < game.getPlayerScore2())){
                                JOptionPane.showMessageDialog(gameOver, "The winner is " + p2);
                            }
                            else if(game.isGameOver() && (game.getPlayerScore1() == game.getPlayerScore2())){
                                JOptionPane.showMessageDialog(gameOver, "It is a draw ");
                            }
                        }
                    }
                }
            }
        }  
        public void mouseEntered(MouseEvent e) {}  
        public void mouseExited(MouseEvent e) {}  
        public void mousePressed(MouseEvent e) {}  
        public void mouseReleased(MouseEvent e) {}   

        
    }
}