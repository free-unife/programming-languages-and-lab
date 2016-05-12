package person;

public class Student extends Person
{
    protected int sid;

    /* Constructor. */
    public Student (String n, int yrsold, int id)
    {
        super (n, yrsold);
        sid = id;
    }

    public void print ()
    {
        super.print ();
        System.out.println ("My id is " + sid);
    }
}
