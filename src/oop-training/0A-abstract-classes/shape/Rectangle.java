/*
 * Rectangle.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

package shape;

public class Rectangle extends Shape
{
    /* width, height. */
    protected double w, h;

    public Rectangle (double w, double h)
    {
        this.w = w;
        this.h = h;
    }

    public double area ()
    {
        return (this.w * this.h);
    }

    public double perimeter ()
    {
        return ((2 * this.w) + (2 * this.h));
    }

    public double getWidth ()
    {
        return this.w;
    }

    public double getHeight ()
    {
        return this.h;
    }
}
