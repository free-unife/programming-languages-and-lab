/*
 * ClockMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class ClockMain
{
    /* Traditional C-like function so we can re-use this code. */
    private static void printTime (Clock c)
    {
        System.out.print (c.getHours() + " h : ");
        System.out.print (c.getMinutes() + " m : ");
        System.out.print (c.getSeconds() + " s . ");
        System.out.print (c.getMilliseconds() + " ms\n");
    }

    public static void main (String[] args)
    {
        int i;
        int halfday = 43200000;
        Clock c = new Clock ();

        printTime(c);

        for ( i = 0; i < halfday; i++)
            c.tic ();

        printTime(c);

        for ( i = 0; i < halfday / 2; i++)
            c.tic ();

        printTime(c);
    }
}
