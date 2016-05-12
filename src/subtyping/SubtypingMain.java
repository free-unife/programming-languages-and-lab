/*
 * SubtypingMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

/* Import classes from counter package (located in the counter directory). */
import counter.*;

public class SubtypingMain
{
    public static void main (String[] args)
    {
        int i;
        /* Counter c = new Counter (); and the following, give the same
         * result. This is called subtyping i.e: a typecasting for classes.
         * Since BiCounter is a subclass of Counter this is like doing:
         * int a = 10; double d = a;. Doing the opposite would not work.
         * Also c.dec() would not work because this belongs to BiCounter only.
         */
        Counter c = new BiCounter ();
        /* We want to test now if subtyping ignores overriding of the
         * subclass, using the inc method (which has been overridden in the
         * SubCounter class.
         */
        Counter cs = new SubCounter ();
        BiCounter b;

        c.inc ();
        c.inc ();
        c.inc ();
        c.inc ();

        System.out.println (c.getValue ());

        c.reset ();
        cs.reset ();
        for (i = 0; i < 150; i++)
        {
            c.inc ();
            cs.inc ();
        }
        /* We expect to obtain the same results, but we don't. This means
         * that inheritance must only be used to extend classes and not to
         * substitute (by overriding).
         */
        if ( c.getValue () != cs.getValue ())
            System.out.println ("WARNING: Subtyping does not work with overriding.");

        /* Downcasting example. We can use the dec method, which is defined in
         * the BiCounter class on a Counter object with the following two
         * possibilities:
         */
        b = (BiCounter) c;
        System.out.println ("c before = " + c.getValue ());
        System.out.println ("b before = " + b.getValue ());
        b.dec ();
        /* Casting without saving result into intermediate variable. */
        ((BiCounter) c).dec();
        System.out.println ("c after = " + c.getValue ());
        System.out.println ("b after = " + b.getValue ());
    }
}
