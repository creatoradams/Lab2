// Nick Adams
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EventPanel extends JPanel
{
    private Event event; // the event that this panel displays

    public EventPanel(Event event)
    {
        this.event = event; // store event
        setLayout(new BorderLayout());

        // display details of the event
        JLabel name = new JLabel("Event: " + event.getName());
        JLabel time = new JLabel("Date: " + event.dateTime);
        JTextArea Details = new JTextArea(event.toString());
        Details.setEditable(false);
        add(Details, BorderLayout.CENTER);


    }
    JButton completeButton = new JButton("");
}
