//Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
//France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the
//countries on console whenever the countries are selected on the list.
package basics;
import java.util.HashMap;
import java.util.List;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CountryCapitalList extends JFrame {

    private JList<String> countryList;
    private HashMap<String, String> capitalMap;

    public CountryCapitalList() {

        // Create map of countries and capitals
        capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "Addis Ababa");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Create list model
        DefaultListModel<String> model = new DefaultListModel<>();
        for (String country : capitalMap.keySet()) {
            model.addElement(country);
        }

        // Create JList
        countryList = new JList<>(model);

        // Add listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {

                    List<String> selected = countryList.getSelectedValuesList();

                    for (String country : selected) {
                        System.out.println("Capital of " + country + " is: " + capitalMap.get(country));
                    }
                }
            }
        });

        add(new JScrollPane(countryList));

        setTitle("Country Capitals");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}
