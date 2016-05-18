/*
 * Reverse.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

import java.util.*;

/* Simply print the input (args) reversed. */
public class Reverse
{
    public static void main (String[] args)
    {
        int i;
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

        /* boolean ListIterator.hasPrevious ()
         * Object ListIterator.previous ()
         * Of course we have the correspondent "next" methods.
         */
        System.out.println ("ArrayList:");
        for (ListIterator it = la.listIterator (la.size ()); it.hasPrevious (); )
        {
            System.out.print (it.previous () + " ");
        }
        System.out.println ();

        System.out.println ("LinkedList:");
        for (ListIterator it = ll.listIterator (ll.size ()); it.hasPrevious (); )
        {
            System.out.print (it.previous () + " ");
        }
        System.out.println ();

        System.out.println ("Vector:");
        for (ListIterator it = lv.listIterator (lv.size ()); it.hasPrevious (); )
        {
            System.out.print (it.previous () + " ");
        }
        System.out.println ();
    }
}
