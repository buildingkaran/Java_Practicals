import javax.swing.*;
import java.awt.event.*;

public class MouseEventFrameDemo extends JPanel {

    public MouseEventFrameDemo() {
        JFrame frame = new JFrame("Child Frame");
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(300, 200);

        addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                frame.setVisible(true);  
            }

            public void mouseExited(MouseEvent e) {
                frame.setVisible(false);  
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                 JFrame appletWindow = new JFrame("Applet Window");
                appletWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                appletWindow.setSize(400, 300);
                appletWindow.setLocation(100, 100);

                MouseEventFrameDemo panel = new MouseEventFrameDemo();
                appletWindow.add(panel);
                appletWindow.setVisible(true);  
            }
        });
    }
}