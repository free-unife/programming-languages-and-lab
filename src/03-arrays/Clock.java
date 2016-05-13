/*
 * Clock.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

/* A more sophisticated clock that uses seconds and milliseconds as well as
 * using arrays*/
public class Clock
{
    private Counter[] c;

    public Clock()
    {
        int i;
        c = new Counter[4];

        for (i = 0; i < 4; i++)
            c[i] = new Counter();
    }

    public void reset()
    {
        int i;

        for (i = 0; i < 4; i++)
            c[i].reset ();
    }

    /* Increment a 24 hour clock by one millisecond. */
    public void tic()
    {
        c[3].inc();
        if ( c[3].getValue () >= 1000 )
        {
            c[3].reset();
            c[2].inc();
        }
        if ( c[2].getValue () >= 60 )
        {
            c[2].reset();
            c[1].inc();
        }
        if ( c[1].getValue () >= 60 )
        {
            c[1].reset();
            c[0].inc();
        }
        if ( c[0].getValue () >= 24 )
            c[0].reset ();
    }

    public int getMilliseconds()
    {
        return ( c[3].getValue() );
    }

    public int getSeconds()
    {
        return ( c[2].getValue() );
    }

    public int getMinutes()
    {
        return ( c[1].getValue() );
    }

    public int getHours()
    {
        return ( c[0].getValue() );
    }
}
