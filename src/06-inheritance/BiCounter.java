/*
 * BiCounter.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

/* Note the extends keyword. This is a subclass (or derived class) of Counter.
 *
 * Here we can:
 * Add methods
 * Add attributes
 * Redefine methods (overriding).
 */
public class BiCounter extends Counter
{
    /* New method. */
    public void dec()
    {
        val--;
    }

    /* Overridden method from the class Counter.
     * This changes the behaviour of the inc method defined in Counter.
     */
    public void inc()
    {
        int i;

        /* With the keyword super, we are invoking te specified method of the
         * superclass. This is useful, since we don't have to know the
         * implementative details of the superclass. */
        for (i = 0; i < 10; i++)
            super.inc();
        if (super.getValue() == 100)
            super.reset();
    }
}
