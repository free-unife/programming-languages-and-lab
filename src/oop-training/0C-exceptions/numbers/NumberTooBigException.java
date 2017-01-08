/*
 * NumberTooBigException.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

package numbers;

public class NumberTooBigException extends Exception
{
    /* Create a new exception. */
    public NumberTooBigException ()
    {
        super ();
    }

    /* Create a new exception with an error message. */
    public NumberTooBigException (String s)
    {
        super (s);
    }
}
