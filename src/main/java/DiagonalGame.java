import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// This should be a simple game where players are rated on how close they are able to click to
// the major diagonal (the diagonal from the top left to the bottom right)
// Each time the player clicks, they should be rated on how close they were to the diagonal
// in terms of the distance formula. For instance:
// * > 50: Bad!
// * 20 - 50: Okay
// * 10 - 20: Good
// * 5 - 10: Great
// * 1 - 5: Excellent
// * 0: Perfect!

public class DiagonalGame {
    JFrame frame;
    JPanel panel1;
    JTextField field1;

    public DiagonalGame() {
        // Set up the frame
        frame = new JFrame("Diagonal Game");
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
                double P = 501;
                for (int i = 0; i < 500; i++) {
                    double W = Math.sqrt(Math.pow(i - e.getX(), 2.0) + Math.pow(i - e.getY(), 2.0));

                    if (W < P) {
                        P = W;
                    }
                }
                if (P > 50){
                    field1.setText("Bad!");
                    }
                else if (P < 50 && P > 20){
                        field1.setText("Okay");
                    }
                else if (P < 20 & P > 10){
                        field1.setText("Good");
                    }
                else if (P < 10 && P > 5){
                        field1.setText("Great");
                    }
                else if (P < 5 && P > 1){
                        field1.setText("Excellent");
                    }
                else{
                    field1.setText("Perfect");
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {

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
        DiagonalGame s = new DiagonalGame();
    }
}
