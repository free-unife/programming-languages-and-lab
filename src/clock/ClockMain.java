/*
 * ClockMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

/*package clockCounter;*/

public class ClockMain
{
    public static void main (String[] args)
    {
        int i;
        Clock c = new Clock ();

        for ( i = 0; i < 125; i++)
            c.tic ();

        System.out.println (c.getHours() + " h : " + c.getMinutes() + " m");
    }
}
