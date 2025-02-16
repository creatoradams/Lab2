// subclass
// Nick Adams : Lab 2
import java.time.LocalDateTime;

public class Deadline extends Event implements Completable
{
    boolean complete; // tracks completion status of a task from a Deadline or Meeting object

    // constructor
    public Deadline(String name, LocalDateTime deadline)
    {
        super(name, deadline); // call the Event constructor and set name and deadline
    }

    @Override
    public String getName()
    {
        return name;
    }


  // marks task as complete
    @Override
    public void complete()
    {
    this.complete = true;
    }

    // used to retrieve the completion status
    @Override
    public boolean isComplete()
    {
        return complete;
    }

}
