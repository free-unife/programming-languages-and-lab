/*
 * CountFrequencySorted.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

import java.util.*;

/* Count word frequency with words sorted alphabetically.
 * For more information have a look at ../maps
 */
public class CountFrequencySorted
{
    public static void main (String[] args)
    {
        int i;
        Integer freq;
        /* TreeMap seems to be the only implementation available for SortedMap.
         * You should get same result for TreeMap implementations for both
         * Map and SortedMap objects.
         */
        SortedMap<String, Integer> mt = new TreeMap<String, Integer> ();

        for (i = 0; i < args.length; i++)
        {
            freq = (Integer) mt.get (args[i]);
            mt.put (args[i], (freq == null ?
                new Integer (1) : new Integer (freq.intValue () + 1)));
        }

        System.out.println ("TreeMap");
        System.out.println (mt.size () + " distinct words");
        System.out.println (mt);
    }
}
