// Nick Adams : Lab 2
// super class
import java.time.LocalDateTime;

public abstract class Event implements Comparable<Event>
{
    // variables to store the event name and date, time
    String name;
    LocalDateTime dateTime;

    // create constructor
    public Event(String name, LocalDateTime dateTime)
    {
        this.name = name;
        this.dateTime = dateTime;
    }

    // create getters and setters : alt + ins & intellij helps you :p
    public LocalDateTime getDateTime()
    {
        return dateTime;
    }

    public abstract String getName(); // abstract methods cannot have a body, implemented in Meeting

    public void setDateTime(LocalDateTime dateTime)
    {
        this.dateTime = dateTime;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public int compareTo(Event o)
    {
        return this.dateTime.compareTo(o.getDateTime()); // this will compare event objects
    }
}
