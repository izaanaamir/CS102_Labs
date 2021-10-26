import javax.swing.*;

import java.awt.*;

public class SOSCanvas extends JPanel{

    private SOS SOSgame;
    int totalSize;

    public SOSCanvas(SOS SOSgame){
        this.SOSgame = SOSgame;
        totalSize = SOSgame.getDimension() * 100;
    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int dimension = SOSgame.getDimension();
        int gridValue = totalSize/dimension;
        int space = (totalSize/2)/dimension;
         
        g.drawRect(0, 0, totalSize, totalSize);
        for (int i = 0; i < dimension; i++) {
            g.drawLine(0,i*(gridValue) , totalSize, i*(gridValue));
        }
        for (int j = 0; j < dimension; j++) {
            g.drawLine(j*gridValue, 0, j*gridValue, totalSize);
        }
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if(SOSgame.getCellContents(i, j) == 's'){
                    g.drawString("S", (i*gridValue)+space, (j*gridValue)+space);
                }
            }
        }
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if(SOSgame.getCellContents(i, j) == 'o'){
                    g.drawString("O", (i*gridValue)+space, (j*gridValue)+space);
                }
            }
        }
    }

    public static void main(String[] args) {
        SOS game = new SOS(3);
        JFrame frame = new JFrame();
        SOSGUIPanel guiPanel = new SOSGUIPanel(game, "Izaan", "Eeman");
        frame.setLayout( new BorderLayout() );
        frame.setTitle("SOS Game");
        frame.add(guiPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setResizable(true);
        frame.setVisible(true);



    }
}