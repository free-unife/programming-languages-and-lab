/*
 * BiCounterMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class BiCounterMain
{
    public static void main (String[] args)
    {
        BiCounter c = new BiCounter ();

        /* Inherited method. */
        c.inc ();
        c.inc ();
        c.inc ();
        c.inc ();
        /* New method. */
        c.dec ();

        System.out.println (c.getValue ());
    }
}
