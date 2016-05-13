/*
 * Clock.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

/*package clockCounter;*/

public class Clock
{
    /* Dangling references unless the constructor is called. */
    private Counter hours, minutes;

    /* Clock constructor.
     * When the Clock object is not used anymore even the hours and minutes
     * attributes are freed by the garbage collector automatically.
     */
    public Clock()
    {
        hours = new Counter ();
        minutes = new Counter ();
    }

    public void reset()
    {
        hours.reset ();
        minutes.reset ();
    }

    /* Increment a 24 hour clock by one minute. */
    public void tic()
    {
        minutes.inc ();
        if ( minutes.getValue () >= 60 )
        {
            minutes.reset ();
            hours.inc ();
        }
        if ( hours.getValue () >= 24 )
            hours.reset ();
    }

    public int getMinutes()
    {
        return ( minutes.getValue() );
    }

    public int getHours()
    {
        return ( hours.getValue() );
    }
}
