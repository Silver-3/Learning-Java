import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("dude.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00)); // set label colour
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(0); // set gap between label and image
        label.setBackground(Color.black); 
        label.setOpaque(true); // display background
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(100, 100, 250, 250); // X, Y, Width, Height

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500, 500); manually set frame size
        // frame.setLayout(null); // to setbounds of label
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // automatically set frame size
    }
}