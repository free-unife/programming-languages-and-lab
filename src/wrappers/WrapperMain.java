/*
 * WrapperMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class WrapperMain
{
    public static void main (String[] args)
    {
        int n;
        double dd;
        String s = new String ("1421907");
        Integer i = new Integer (10);
        Character c = new Character ('f');
        Double d = new Double (1980087.124342);

        System.out.println (i.intValue());
        System.out.println (c.charValue());
        System.out.println (d.doubleValue());

        /* atoi equivalent and toString method. */
        i = new Integer (s);
        if ((i.toString ()).equals (s))
            System.out.println ("Wrapper classes are very interesting and powerful: they enable you to treat primitive types like objects (as it should be).");

        /* Change type very easily with the correct methods. */
        dd = i.doubleValue ();
        System.out.println (dd + d.doubleValue());

        /* Other two methods to transform a string to an integer: */
        /* By creating a new object: */
        i = new Integer (s);
        n = i.intValue ();
        System.out.println (n);
        /* Or, with a static method (a service): */
        n = Integer.parseInt (s);
        System.out.println (n);
        /* This is what really happens for both previous cases (i.e: when the
         * numbers are printed out). As you can see in the first case we use
         * the classical method, while in the second case we use a static
         * function (that has the name of the class as object). */
        System.out.println (i.toString ());
        System.out.println (Integer.toString (n));
    }
}
