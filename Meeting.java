import java.time.Duration;
import java.time.LocalDateTime;

public class Meeting extends Event implements Completable // inherits Event and implements Completable interface
{
    private  LocalDateTime endDateTime; // instance variable to store meeting end date & times
    private String location; // stores meeting location
    private boolean complete; // track if complete

    // constructor
    public Meeting(String name, LocalDateTime start, LocalDateTime end, String location)
    {
        super(name, start); // call constructor of the superclass Event to initialize name and start.
        this.endDateTime = end; // initialize endDateTime
        this.location = location; // initialize location
        this.complete = false; // set complete too false, to make it not complete by default
    }

    // get end date and time of meeting
    public LocalDateTime getEndTime()
    {
        return endDateTime;
    }

    public LocalDateTime getEndDateTime()
    {
        return endDateTime;
    }

    // set end date and time
    public void setEndDateTime(LocalDateTime end)
    {
        this.endDateTime = end;
    }

    // calculate the duration, imported Duration class above
    public Duration getDuration()
    {
        return Duration.between(dateTime, endDateTime); // calc time between start and end
    }

    // get location of the meeting
    public String getLocation()
    {
        return location;
    }

    // set location
    public void setLocation(String location)
    {
        this.location = location;
    }

    // return name of meeting
    @Override
    public String getName()
    {
        return name;
    }

    // marks meeting as  complete
    @Override
    public void complete()
    {
        this.complete = true;
    }

    // checks if meeting is complete
    @Override
    public boolean isComplete()
    {
        return complete;
    }
}
