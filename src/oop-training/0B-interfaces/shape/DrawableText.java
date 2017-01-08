/*
 * DrawableText.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

/* A text is not really a shape, but i won't bother changing the name to
 * package.
 */
package shape;

/* Note that this class is not a subclass of Shape. Two different classes are
 * implemented. */
public class DrawableText implements Drawable, Characters
{
    /* A drawable text has colour, position and some content (a text). */
    protected int c;
    protected double x, y;
    protected String s, f;

    /* Note the absence of the super method, since this class inherits only
     * the opaque methods of its interface.
     */
    public DrawableText (String s)
    {
        this.s = s;
    }

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
        System.out.println ("Text @ (" + x + ", " + y + ") colour = " + c + " font = " + f);
    }

    /* Implementation of Characters interface. */
    public void setFont (String f)
    {
        this.f = f;
    }
}
