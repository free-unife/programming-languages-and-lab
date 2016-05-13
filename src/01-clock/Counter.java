/*
 * Counter.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

/* In this case, for simplicity, all the files belong to the same package
 * (which is a logical container of different yet logically connected classes).
 */
/*package clockCounter;*/

public class Counter
{
    /* Not accessible from outside. */
    private int val;

    /* Note that this method, the default constructor, does not have any type
     * of return value. It is not compulsory to be present. */
    public Counter()
    {
        val = 0;
    }

    /* This is the alternative constructor that is called if an input value is
     * specified. */
    public Counter(int n)
    {
        val = n;
    }

    public void reset()
    {
        val = 0;
    }

    /* Just like the constructor, having two methods with the same name but
     * with different behaviours (because of the different number of input
     * parameters) is called overloading. */
    public void inc()
    {
        val++;
    }

    public void inc( int n )
    {
        val+= n;
    }

    public void dec()
    {
        val--;
    }

    public void dec( int n )
    {
        val-= n;
    }

    public int getValue()
    {
        return val;
    }

    /* Copy the state of a Counter object (i.e: only the val variable).
     * usage: newObj.copy ( oldObj )
     */
    public void copy( Counter tmp )
    {
        val = tmp.val;
    }

    /* Check if two counter objects are equal. */
    public boolean equals( Counter tmp )
    {
        return ( val == tmp.val );
    }

    /* Exchange the state of two object counters.
     * usage: obj1.exchange ( obj2 )
     * Objects are always passed by reference unlike in C where they are psssed
     * by value.
     */
    public void exchange ( Counter tmp )
    {
        Counter tmpo = new Counter ( val );

        val = tmp.getValue ();
        tmp.copy ( tmpo );
    }
}
