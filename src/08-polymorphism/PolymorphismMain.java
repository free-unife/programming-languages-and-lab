/*
 * PolymorphismMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

/* Import classes from person package (located in the person directory). */
import person.*;

public class PolymorphismMain
{
    public static void main (String[] args)
    {
        Person p = new Person ("Jack E. Tripper", 30);
        Student s = new Student ("Lt. Commander Data", 26, 1001011);
        /* Subtyping. */
        Person t = new Student ("Janet Wood", 28, 21364);

        p.print ();
        s.print ();

        /* Doing the following implies polymorphism. */
        p = s;
        /* This will invoke the subclass method, thus printing Student
         * information instead of Person information.
         */
        p.print ();

        /* The method called is the one of the subclass (since there is a
         * print method in both classes).
         */
        t.print ();
    }
}
