/*
 * SuperCounterMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class SuperCounterMain
{
    public static void main (String[] args)
    {
        /* The objects of the superclasses are created automatically. */
        SuperCounter c = new SuperCounter ();

        /* Overridden method. */
        c.inc ();
        c.inc ();
        c.inc ();
        c.inc ();
        /* Overloaded methods. */
        c.inc (5);
        c.dec (25);

        c.inc ();
        System.out.println (c.getValue ());
        c.inc ();
        System.out.println (c.getValue ());
        c.inc();
        System.out.println (c.getValue ());
        c.inc ();
        c.inc ();
        c.inc ();
        c.inc ();
        System.out.println (c.getValue ());
        c.inc ();
        System.out.println (c.getValue ());
    }
}
