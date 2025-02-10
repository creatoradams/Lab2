import java.time.LocalDateTime;

public abstract class Event implements Comparable<Event>
{
    // members of the  class
    String name;
    LocalDateTime dateTime;
    // create constructor
    public Event(String name, LocalDateTime dateTime)
    {
        this.name = name;
        this.dateTime = dateTime;
    }
    public LocalDateTime getDateTime()
    {
        return dateTime;
    }

    public String getName()
    {
        return name;
    }

}
