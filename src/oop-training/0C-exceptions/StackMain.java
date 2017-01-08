/*
 * StackMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

import stack.*;

public class StackMain
{
    public static void main (String[] args)
    {
        int i;
        StackOfStrings st = new StackOfStrings(5);

        try
        {
            st.push ("deci");
            st.push ("centi");
            st.push ("milli");
            st.push ("micro");
            st.push ("nano");
            System.out.println (st.pop ());
            st.push ("pico");
            System.out.println (st.pop ());
            st.push ("femto");
            System.out.println (st.pop ());
            st.push ("atto");
            System.out.println (st.pop ());
            st.push ("zepto");
            System.out.println (st.pop ());
            st.push ("yocto");
            st.push ("yocto");
        }
        catch (StackOverflowException e)
        {
            System.out.println ("Overflow");
        }
        catch (StackUnderflowException e)
        {
            System.out.println ("Underflow");
        }
        catch (Exception e)
        {
            System.out.println (e.getMessage ());
        }

        try
        {
            for (i = 0; i < 20; i++)
                System.out.println (st.pop ());
        }
        catch (StackUnderflowException e)
        {
            System.out.println ("Underflow");
        }

    }
}
