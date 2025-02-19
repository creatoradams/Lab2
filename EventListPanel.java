import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

// Nick Adams
public class EventListPanel extends JPanel
{
    private ArrayList<Event> events; // list of events
    private JPanel controlPanel; // holds the controls for the event display
    private JPanel displayPanel; // a panel to hold the EventPanels corresponding to the events.
    private JComboBox<String> sortDropDown; // a dropdown that will sort the events in the list by name, date or by the same qualities but in reverse order
    private JCheckBox filterDisplay; // a set of checkboxes that allow the user to filter the displayed events
    private JButton addEventButton; // a button that opens an AddEventModal

    public EventListPanel()
    {
        // initialize
        events = new ArrayList<>();
        displayPanel = new JPanel();
        controlPanel = new JPanel();
        filterDisplay = new JCheckBox();
        addEventButton = new JButton("Add Event");
        addEventButton.addActionListener(e -> {});


        //setup control panel
        controlPanel = new JPanel();
        sortDropDown = new JComboBox<>(new String[]{"Sort by name", "Sort by date",});
        sortDropDown.addActionListener(e -> {});
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
        controlPanel.add(addEventButton);
        controlPanel.add(filterDisplay);
        controlPanel.add(sortDropDown);


        // setup display panel
        displayPanel = new JPanel();
        displayPanel.setLayout(new BoxLayout(displayPanel, BoxLayout.Y_AXIS));
        add(displayPanel, BorderLayout.CENTER);


        // add components to EventListPanel
        add(controlPanel, BorderLayout.NORTH);
        add(displayPanel, BorderLayout.CENTER);




    }




}
