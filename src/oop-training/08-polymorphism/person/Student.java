/*
 * Student.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

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
