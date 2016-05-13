/*
 * Drawable.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

package shape;

/* This is very similar to an abstract class except that ALL defined methods
 * are opaque (without implementation).
 */
public interface Drawable
{
    public void setColor (int c);
    public void setPosition (double x, double y);
    public void draw ();
}
