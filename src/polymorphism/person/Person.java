package person;

public class Person
{
    protected String name;
    protected int age;

    /* Constructor. */
    public Person (String n, int yrsold)
    {
        name = n;
        age = yrsold;
    }

    public void print ()
    {
        System.out.print ("My name is " + name);
        System.out.println (" and I'm " + age + " years old");
    }
}
