/*
 * DrawableRectangle.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

package shape;

/* This class implements the Drawable interface class. Since a class cannot
 * be derived from more than one class we must use interfaces instead of plain
 * classes.
 */
public class DrawableRectangle extends Rectangle implements Drawable
{
    protected int c;
    protected double x, y;

    /* Create a new DrawableRectangle object. */
    public DrawableRectangle (double w, double h)
    {
        super (w, h);
    }

    /* Note that ALL methods which have been defined in Drawable (an
     * interface class) must be implemented in DrawableRectangle and
     * DrawableCircle (the classes that implement the opaque methods).
     */
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
        System.out.println ("Rect @ (" + x + ", " + y + ") colour = " + c);
    }
}
