// subclass
// Nick Adams : Lab 2
import java.time.LocalDateTime;

public class Deadline extends Event implements Completable
{
    boolean complete; // tracks completion status of a task from a Deadline or Meeting object

    public Deadline(String name, LocalDateTime deadline)
    {
        super(name, deadline);
    }

    @Override
    public String getName()
    {
        return name;
    }


  // will change the state of a Completable object to true
    @Override
    public void complete()
    {
    this.complete = true;
    }

    // used to retrieve the completion status of a Completable object
    @Override
    public boolean isComplete()
    {
        return complete;
    }

}
