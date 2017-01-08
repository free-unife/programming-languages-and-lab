/*
 * InterfacesMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

import shape.*;

public class InterfacesMain
{
    public static void main (String[] args)
    {
        int i;
        Drawable[] drawings = new Drawable [4];
        /* Use of subtyping for an interface. */
        drawings[0] = new DrawableCircle (14.9);
        drawings[1] = new DrawableRectangle (5.3, 2.7);
        drawings[2] = new DrawableRectangle (9.8, 8.7);
        drawings[3] = new DrawableText ("NCC-1701");

        for (i = 0; i < drawings.length; i++)
        {
            drawings[i].setPosition ((i + 1) * 10.5, (i + 1) * 5.31);
            drawings[i].setColor (i + 0xAAA000);
        }
        /* Unfortunately we need typecasting here. */
        ((DrawableText) drawings[3]).setFont ("Sans Serif");

        /* The power of all this is that we can draw all our different
         * objects with a simple loop only. */
        for (i = 0; i < drawings.length; i++)
            drawings[i].draw ();
    }
}
