/*
 * DrawableCircle.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

package shape;

public class DrawableCircle extends Circle implements Drawable
{
    protected int c;
    protected double x, y;

    /* Create a new DrawableCircle object. */
    public DrawableCircle (double r)
    {
        super (r);
    }

    /* There is the "problem" of code duplication for the following two
     * methods, which are exactly the same for the rectangle. */
    public void setColor (int c)
    {
        this.c = c;
    }

    public void setPosition (double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void draw ()
    {
        System.out.println ("Circle @ (" + x + ", " + y + ") colour = " + c);
    }
}

