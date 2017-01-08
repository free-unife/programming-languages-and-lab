/*
 * Counter.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class Counter
{
    /* Not accessible from outside. */
    private int val;

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
