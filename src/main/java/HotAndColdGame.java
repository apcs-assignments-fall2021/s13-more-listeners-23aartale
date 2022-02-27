import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class HotAndColdGame {
    JFrame frame;
    JPanel panel1;
    JTextField field1;
    int x = (int) (Math.random() * 500) + 1;
    int y = (int) (Math.random() * 500) + 1;
    int [][] win = new int[x][y];
    int [][] previous = new int[0][0];
    public HotAndColdGame() {
        // Set up the frame
        frame = new JFrame("Hot and Cold Game:");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up components/panels
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(500,500));
        frame.add(panel1, BorderLayout.NORTH);

        field1 = new JTextField();
        frame.add(field1, BorderLayout.SOUTH);

        // Set up MouseListener
        panel1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                double W = Math.sqrt(Math.pow(x - e.getX(), 2.0) + Math.pow(y - e.getY(), 2.0));
                if (W > 50) {
                    field1.setText("Cold");
                } else if (W < 50 && W > 20) {
                    field1.setText("Luke Warm");
                } else if (W < 20 & W > 10) {
                    field1.setText("Hot");
                } else if (W < 10 && W > 5) {
                    field1.setText("Pretty Hot");
                } else if (W < 5 && W > 1) {
                    field1.setText("Super Hot!");
                } else {
                    field1.setText("Perfect");
                }

                int a = e.getX();
                int b = e.getY();
                previous[0][0] = previous[a][b];
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });




        // pack and show
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        HotAndColdGame s = new HotAndColdGame();
    }
}
