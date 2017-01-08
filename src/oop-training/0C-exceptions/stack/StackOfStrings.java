/*
 * StackOfStrings.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

package stack;

public class StackOfStrings
{
    private String[] items;
    private int count;

    /* Create maxStrings number of strings. */
    public StackOfStrings (int maxStrings)
    {
        this.items = new String[maxStrings];
        this.count = 0;
    }

    public boolean isEmpty ()
    {
        return (this.count == 0);
    }

    public void push (String s) throws StackOverflowException
    {
        StackOverflowException ex;

        try
        {
            /* If there is an exception on the first instruction, the second
             * one (this.count++) won't be run. */
            this.items[this.count] = s;
            this.count ++;
        }
        catch (ArrayIndexOutOfBoundsException ae)
        {
            ex = new StackOverflowException ();
            throw ex;
        }
    }

    public String pop () throws StackUnderflowException
    {
        String s;
        StackUnderflowException ex;

        try
        {
            this.count --;
            s = new String (this.items[this.count]);
        }
        catch (ArrayIndexOutOfBoundsException ao)
        {
            count = 0;
            ex = new StackUnderflowException ();
            throw ex;
        }
        /* s is returned only if there is no exception, otherwise the error
         * won't be thrown (f.e. if return s was inside a finally block).
         */
        return s;
    }
}
