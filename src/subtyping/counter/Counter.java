/*
 * Counter.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

package counter;

/* This is a superclass (or base class) of BiCounter. */
public class Counter
{
    protected int val;

    public Counter()
    {
        val = 0;
    }

    public void reset()
    {
        val = 0;
    }

    public void inc()
    {
        val++;
    }

    public int getValue()
    {
        return val;
    }
}
