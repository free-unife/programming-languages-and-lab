/*

 * AbstractClassMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

import shape.*;

public class AbstractClassMain
{
    public static void main (String[] args)
    {
        int i;
        double totalArea = 0.0;
        /* A Shape can be a Circle or a Rectangle. */
        Shape[] shapes = new Shape [3];
        /* The following is possible thanks to subtyping. */
        shapes[0] = new Circle (14.9);
        shapes[1] = new Rectangle (5.3, 2.7);
        shapes[2] = new Rectangle (9.8, 8.7);

        for (i = 0; i < shapes.length; i++)
            totalArea += shapes[i].area();

        System.out.println ("Total area of the " + shapes.length + " shapes is " + totalArea);
    }
}
