/*
 * Shape.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

package shape;

/* An abstract class is used as a superclass of other classes which have
 * common aspects. In this specific example, all shapes have a computable
 * area as well as a computable perimeter. The problem is that each shape has
 * its own equation to compute those attributes. This is why we define opaque
 * methods here and they will be implemented in a different way for each
 * subclass.
 */
public abstract class Shape
{
    /* We can calculate area and perimeter of a shape. */
    public abstract double area ();
    public abstract double perimeter ();
}
