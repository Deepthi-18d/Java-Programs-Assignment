package basics;


import java.awt.Color;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorTabbedPane extends JFrame {

    public ColorTabbedPane() {

        // Create panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.MAGENTA);
        p3.setBackground(Color.YELLOW);

        // Create tabbed pane
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 300, 200);

        tp.add("CYAN", p1);
        tp.add("MAGENTA", p2);
        tp.add("YELLOW", p3);

        // Add listener to detect tab change
        tp.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tp.getSelectedIndex();
                String title = tp.getTitleAt(index);
                System.out.println("Selected Color: " + title);
            }
        });

        // Add to frame
        add(tp);

        setTitle("Color TabbedPane");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorTabbedPane();
    }
}