package basics;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.*;

	public class Buttons {
		    JLabel l1;

		    Buttons() {

		        JFrame f = new JFrame("Image Button Example");

		        l1 = new JLabel();
		        l1.setBounds(50, 50, 500, 60);
		        l1.setFont(new Font("Arial", Font.BOLD, 25));

		        // Load Images (Keep images in same folder)
		        ImageIcon digitalIcon = new ImageIcon("digital.jpg");
		        ImageIcon hourGlassIcon = new ImageIcon("hourglass.jpg");

		        JButton b1 = new JButton(digitalIcon);
		        JButton b2 = new JButton(hourGlassIcon);

		        b1.setBounds(80, 150, 120, 120);
		        b2.setBounds(250, 150, 120, 120);

		        b1.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                l1.setText("Digital Clock is pressed");
		            }
		        });

		        b2.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                l1.setText("Hour Glass is pressed");
		            }
		        });

		        f.add(b1);
		        f.add(b2);
		        f.add(l1);

		        f.setSize(450, 350);
		        f.setLayout(null);
		        f.setVisible(true);
		        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    }

		    public static void main(String[] args) {
		        new Buttons();
		    }
		}



