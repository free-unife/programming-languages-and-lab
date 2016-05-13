/*
 * Circle.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

package shape;

public class Circle extends Shape
{
    protected double r;

    public Circle (double r)
    {
        this.r = r;
    }

    /* Here lie the real implementations of the previously defined opaque
     * methods. The usual formulas are applied: A = pi * r^2; p = 2 * pi * r
     */
    public double area ()
    {
        return (Math.PI * r * r);
    }

    public double perimeter ()
    {
        return (2 * Math.PI * r);
    }

    public double getRadius ()
    {
        return (r);
    }
}
