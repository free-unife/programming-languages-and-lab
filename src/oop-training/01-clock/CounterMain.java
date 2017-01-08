/*
 * CounterMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

/*package clockCounter;*/

/* This class only works without objects. */
class StaticCounter
{
    private static int val;

    public static void reset()
    {
        val = 0;
    }

    public static void inc()
    {
        val++;
    }

    public static int getValue()
    {
        return val;
    }
}

public class CounterMain
{
    public static void main (String[] args)
    {
        int n;
        /* These are just a dangling reference at this point (just like in C). */
        Counter c1, c2, c3;

        /* Object created in the heap. This is the constructor method which is
         * implicit in every class. */
        c1 = new Counter ();
        c1.reset ();
        c1.inc ();

        n = c1.getValue ();
        System.out.println (n);

        c2 = new Counter ();
        c2.copy (c1);
        System.out.println (c2.getValue ());

        c1.inc();
        c2 = c1;
        System.out.println (c1.getValue () + " " + c2.getValue ());
        c1 = null;
        System.out.println (c2.getValue ());
        if (c1 == null)
            System.out.println ("c1 is now null.");

        c1 = new Counter ();
        c1.copy(c2);
        if (c1.equals (c2))
            System.out.println ("c1 equals c2.");

        c3 = new Counter (25);
        System.out.println (c3.getValue ());

        c3.dec (9);
        c3.dec ();

        System.out.println ("c2 = " + c2.getValue ());
        System.out.println ("c3 = " + c3.getValue ());

        System.out.println ("Exchanging c2 with c3");
        c3.exchange ( c2 );
        System.out.println ("c2 = " + c2.getValue ());
        System.out.println ("c3 = " + c3.getValue ());

        n = 0;
        /* As you can see instead of using <object>.<method> syntax, we use
         * <ClassName>.<StaticMethod> syntax. */
        StaticCounter.reset ();
        StaticCounter.inc ();
        StaticCounter.inc ();
        n = StaticCounter.getValue ();
        System.out.println (n);

        /* We don't care about freeing c1 since the garbage collector will
         * free all object without references. */
    }
}
