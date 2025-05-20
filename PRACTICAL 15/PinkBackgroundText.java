import javax.swing.*;
import java.awt.*;

public class PinkBackgroundText extends JFrame {

    public PinkBackgroundText() {
        setTitle("Pink Background with Text");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Custom panel with pink background and text
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                setBackground(Color.PINK);
                g.setColor(Color.BLACK);
                g.setFont(new Font("Arial", Font.BOLD, 20));
                g.drawString("This is a pink background frame!", 50, 100);
            }
        };

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PinkBackgroundText().setVisible(true);
        });
    }
}