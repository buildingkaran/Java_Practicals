import javax.swing.*;

import java.awt.*;



public class BannerScroll extends JFrame implements Runnable {

    private String message = " Welcome to Java Programming ";

    private int x = 400;



    public BannerScroll() {

        setTitle("Scrolling Banner");

        setSize(500, 100);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);



        JPanel panel = new JPanel() {

            protected void paintComponent(Graphics g) {

                super.paintComponent(g);

                g.setFont(new Font("Arial", Font.BOLD, 20));

                g.drawString(message, x, 50);

            }

        };



        add(panel);



        Thread thread = new Thread(this);

        thread.start();

    }



    public void run() {

        while (true) {

            x -= 5;

            if (x + message.length() * 10 < 0) {

                x = getWidth();

            }

            repaint();

            try {

                Thread.sleep(100);

            } catch (InterruptedException e) {

                System.out.println(e);

            }

        }

    }



    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                new BannerScroll().setVisible(true);

            }

        });

    }

}
