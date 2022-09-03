import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Splash extends JFrame implements ActionListener {

    Splash() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(100, 30, 1100, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);
        add(heading);

        // ImageIcon i1 = new
        // ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        JLabel image = new JLabel(new ImageIcon("icons/front.jpg"));
        image.setBounds(50, 100, 1100, 500);
        add(image);

        // ImageIcon i1 = new
        // ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        // Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        // ImageIcon i3 = new ImageIcon(i2);
        // JLabel image = new JLabel(i3);
        // image.setBounds(50, 100, 1050, 500);
        // add(image);

        JButton clickhere = new JButton("Click me");
        clickhere.setBounds(500, 500, 200, 50);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.setFont(new Font("caliber", Font.BOLD, 30));
        
        clickhere.addActionListener(this);
        add(clickhere);

        setSize(1200, 650);
        setLocation(100, 50);
        setVisible(true);

        while (true) {
            heading.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            heading.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Splash();
    }
}
