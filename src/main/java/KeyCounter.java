import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.*;

public class KeyCounter {
    JFrame frame;
    JPanel panel, panel1, panel2, panel3;
    JTextField textField, textField2;
    JLabel label;
    JButton button;
    int counter = 0;
    public KeyCounter() {
        frame = new JFrame("Key Counter");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        label = new JLabel("Type stuff here:");
        panel.add(label);
        frame.add(panel);

        panel1 = new JPanel();
        textField = new JTextField(15);
        panel1.add(textField);
        frame.add(panel1);

        panel2 = new JPanel();
        button = new JButton("Calculate total presses");
        panel2.add(button);
        frame.add(panel2);

        panel3 = new JPanel();
        textField2 = new JTextField(15);
        panel3.add(textField2);
        frame.add(panel3);


        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                counter++;
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField2.setText(counter + "");
                counter = 0;
            }
        });

        frame.pack();
        frame.setVisible(true);

    }

        public static void main (String[]args){
            KeyCounter s = new KeyCounter();
        }
    }

