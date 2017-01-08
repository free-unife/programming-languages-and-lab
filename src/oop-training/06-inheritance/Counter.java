/*
 * Counter.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

/* This is a superclass (or base class) of BiCounter. */
public class Counter
{
   /*
    * If we used private, like in the previous examples, val would only be
    * visible to methods belonging to the Counter and not to BiCounter. Since
    * in BiCounter the method dec uses val, val must be visibile to BiCounter
    * as well. To do this, instead of using the keyword public (that would
    * lead to a full visibility) we use protected. This way only the direct
    * and indirect inherited classes of counter can see val.
    */
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
