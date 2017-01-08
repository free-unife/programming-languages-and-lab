/*
 * Exchange.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

import java.util.*;

public class Exchange
{
    private static void swap (List<String> a, int i, int j)
    {
        /* tmp = A[i]
         * A[i] = A[j]
         * A[j] = tmp
         */
        String tmp = a.get (i);

        a.set (i, a.get (j));
        a.set (j, tmp);
    }

    public static void main (String[] args)
    {
        int i;
        /* List has indices (unlike Set). This also implies the ability to go
         * backwards and forwards easily. Moreover, duplicates are allowed.
         */
        List<String> la = new ArrayList<String> ();
        List<String> ll = new LinkedList<String> ();
        List<String> lv = new Vector<String> ();

        for (i = 0; i < args.length; i++)
        {
            la.add (args[i]);
            ll.add (args[i]);
            lv.add (args[i]);
        }

        System.out.println ("ArrayList:");
        System.out.println (la);
        System.out.println ("LinkedList:");
        System.out.println (ll);
        System.out.println ("Vector:");
        System.out.println (lv);
        if (args.length >= 4)
        {
            /* Swap contents of selected indices. */
            swap (la, 1, 2);
            swap (ll, 1, 2);
            swap (lv, 1, 2);
            swap (la, 2, 3);
            swap (ll, 2, 3);
            swap (lv, 2, 3);
            System.out.println ("Exchanging");
        }
        else
            System.out.println ("NOOP");

        /* As you can see the result does not change from one implementation
         * to another.
         */
        System.out.println ("ArrayList:");
        System.out.println (la);
        System.out.println ("LinkedList:");
        System.out.println (ll);
        System.out.println ("Vector:");
        System.out.println (lv);
    }
}
