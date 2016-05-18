/*
 * FindDups.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

import java.util.*;

/* Since a Set object does not admit adding duplicates, it is perfect to check
 * for duplicates, since they are not added.
 */
public class FindDups
{
    public static void main (String[] args)
    {
        int i, duplicates = 0;
        /* This Set is of String type.
         * Here we use the three possible implementations for a Set object to
         * see the different effects.
         */
        Set<String> sh = new HashSet<String>();
        Set<String> st = new TreeSet<String>();
        Set<String> slh = new LinkedHashSet<String>();

        for (i = 0; i < args.length; i++)
        {
            /* If an element has not been inserted it means that it's a
             * duplicate
             */
            if (!sh.add (args[i]) || !st.add (args[i]) || !slh.add (args[i]))
            {
                System.out.println ("Duplicate word: " + args[i]);
                duplicates++;
            }
        }
        System.out.println (duplicates + " duplicate words.");
        System.out.println (sh.size () + " distinct words");

        /* Compact iterators. One could also do:
         *
         * for (Iterator i = setInstance.iterator (); i.hasNext (); )
         *      System.out.println (i.next ());
         *
         * The important thing to notice is the order of the output elements.
         */
        System.out.println ("-- HashSet --" + "\n");
        for (Object o : sh)
            System.out.println (o.toString ());
        System.out.println ();
        System.out.println ("-- TreeSet --" + "\n");
        for (Object o : st)
            System.out.println (o.toString ());
        System.out.println ();
        System.out.println ("-- LinkedHashSet --" + "\n");
        for (Object o : slh)
            System.out.println (o.toString ());
    }
}
