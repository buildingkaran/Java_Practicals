import javax.swing.*;
import java.awt.event.*;

public class KeyTypeEvent extends JFrame {
    public KeyTypeEvent() {
        setTitle("Key Typed Event");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 300, 30);
        add(textField);

        JLabel statusLabel = new JLabel("Typed character is: ");
        statusLabel.setBounds(50, 100, 300, 30);
        add(statusLabel);

        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char typedChar = e.getKeyChar();
                statusLabel.setText("Typed character is: " + typedChar);
            }

            // Other two methods handled by adapter, so we don’t need to write them
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new KeyTypeEvent().setVisible(true);
            }
        });
    }
}