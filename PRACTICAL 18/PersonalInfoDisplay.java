import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PersonalInfoDisplay extends JFrame {

    public PersonalInfoDisplay() {
        setTitle("Personal Info Display");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton buttonA = new JButton("A");
        JButton buttonB = new JButton("B");
        JLabel label = new JLabel();

        buttonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("<html>Name: Karan Kumar<br>Course: B.Voc in Software Development<br>Roll No: 24107030<br>College: Ramanujan College</html>");
            }
        });

        buttonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("CGPA: 8.73");
            }
        });

        panel.add(buttonA);
        panel.add(buttonB);
        panel.add(label);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PersonalInfoDisplay().setVisible(true);
            }
        });
    }
}