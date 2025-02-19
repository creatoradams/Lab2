// Nick Adams
import javax.swing.*;
import java.awt.*;
import java.sql.Date;
import java.time.LocalDateTime;

public class EventPlanner
{
    public static void main(String[] args)
    {
        // Create JFrame
        JFrame frame = new JFrame("Event Planner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(700, 700);
        frame.getContentPane().setBackground(Color.lightGray);

        // add subpanel : i added this based of Baarsch video but not sure what its for...
        JPanel subPanel = new JPanel();
        subPanel.setBackground(Color.black);
        subPanel.setPreferredSize(new Dimension(100, 100));
        frame.add(subPanel, BorderLayout.CENTER);

        // add eventlistpanel
        EventListPanel eventListPanel = new EventListPanel();
        eventListPanel.setSize(100, 100);
        eventListPanel.setBackground(Color.cyan);
        frame.add(eventListPanel, BorderLayout.SOUTH);


        frame.setVisible(true);

    }

    public static void addDefaultEvents(EventListPanel events) // adds some default events to the EventListPanel to show if add button doesn't work
    {
        Deadline defeaultDeadline = new Deadline("Exam", LocalDateTime.now().plusDays(7)); // add 7 days to when the exam is
        Meeting defaultDeadline = new Meeting("Lecture", LocalDateTime.now(), LocalDateTime.now().plusMinutes(60), "classroom"); // add 60 minutes to when the lecture starts
    }
}
