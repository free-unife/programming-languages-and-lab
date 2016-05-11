/*
 * Eg.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class Eg
{
    public static void main (String[] args)
    {
        int n;
        /* This is just a dangling reference at this point (just like in C). */
        Counter c1;

        /* Object created in the heap. */
        c1 = new Counter ();
        c1.reset();
        c1.inc();
        n = c1.getValue();
        System.out.println(n);
        System.out.println(c1.getValue());
        /* We don't care about freeing c1 since the garbage collector will
         * free all object without references. */
    }

}
