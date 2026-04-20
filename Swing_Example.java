//Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing Programming
//in Blue color plain font with font size of 32 using Jframe and Jlabel
package basics;
	import java.awt.*;
	import javax.swing.*;
	import java.awt.Color;
	import java.awt.Font;
class Swing_Example {
	
		
	    public static void main(String[] args) {

	        // Create the frame (window)
	        JFrame frame = new JFrame("A Simple Swing Application");
	        frame.setSize(275,100);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Creating and Styling the Content (JLabel)
	        JLabel jlab = new JLabel(" Hello! IV C,Welcome to Swing Programming!");
	        jlab.setBounds(100, 100, 400, 200);
	        jlab.setFont(new Font("Verdana", Font.PLAIN, 32));
	        jlab.setForeground(new Color(0, 0, 255));

	        // Create a label
	        JLabel label = new JLabel("Hello, Swing!");
	        label.setBounds(50, 50, 200, 30);

	        // Add components to the frame
	        frame.add(label);
	        frame.add(jlab);

	        // Make the frame visible
	        frame.setVisible(true);

	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	            	new Swing_Example();
	                // removed undefined class (just keep empty or comment)
	                // new SwingExample();
	            }
	        });

	        /* Swing is not thread-safe. This block ensures that the
	         * GUI is created on the Event Dispatch Thread (EDT)
	         */
	    
	}
}
