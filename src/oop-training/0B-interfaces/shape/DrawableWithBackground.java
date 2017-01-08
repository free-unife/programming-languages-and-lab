/*
 * DrawableWithBackground.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

package shape;

/* Although not used, this interface extends the Drawable inteface, just like
 * classes do. This is also known as interface hierarcky. */
public interface DrawableWithBackground extends Drawable
{
    public void setBackgroundColor (int c);
}
