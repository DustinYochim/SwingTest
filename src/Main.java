import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JLabel label = new JLabel(); // label lets you display info on JFrame
        label.setText("Goodbye. Thanks for using our program!"); // set text for label
        label.setFont(new Font("Arial", Font.BOLD, 24)); // change font of label
        label.setForeground(Color.WHITE); // changes text color

        // set the alignment of the label
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        // JFrame = a GUI window to add components to
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("Goodbye Screen"); // sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application rather than hide
        frame.setResizable(false); // prevents frame from being resized
        frame.setSize(800, 800); // sets width and height of frame
        frame.setLocationRelativeTo(null); // center's the frame on the screen

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.add(label);

        frame.getContentPane().setBackground(new Color(18, 18, 18)); // change color of background

        frame.add(label);
        frame.setVisible(true); // make frame visible
    }
}