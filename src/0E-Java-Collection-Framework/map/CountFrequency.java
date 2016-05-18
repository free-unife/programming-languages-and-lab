/*
 * CountFrequency.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

import java.util.*;

/* Count word frequency. */
public class CountFrequency
{
    public static void main (String[] args)
    {
        int i;
        Integer freq0, freq1, freq2;
        /* Our Map objects are made of <key, value> of type <String, Integer>
         * respectively. We can only specify objects here (and not native
         * data types like int).
         */
        Map<String, Integer> mh = new HashMap<String, Integer> ();
        Map<String, Integer> mt = new TreeMap<String, Integer> ();
        Map<String, Integer> mlh = new LinkedHashMap<String, Integer> ();

        /* key = args[i], value = freq.
         * In a Map object no duplicate keys are possible. The only operation
         * possible is to increase the value field (in this case).
         */
        for (i = 0; i < args.length; i++)
        {
            /* Get a value (Integer) given a key (String). Casting is
             * necessary otherwise the Map.get mathod returns an int and not
             * an Integer (which is an object). If a new string is
             * encountered, Map.get method returns null.
             */
            freq0 = (Integer) mh.get (args[i]);
            freq1 = (Integer) mt.get (args[i]);
            freq2 = (Integer) mlh.get (args[i]);
            /* Add a new key-value entry in the Map object. */
            mh.put (args[i], (freq0 == null ?
                new Integer (1) : new Integer (freq0.intValue () + 1)));
            mt.put (args[i], (freq1 == null ?
                new Integer (1) : new Integer (freq1.intValue () + 1)));
            mlh.put (args[i], (freq2 == null ?
                new Integer (1) : new Integer (freq2.intValue () + 1)));
        }

        /* As you can see the order of the elements changes depending on the
         * implementation.
         */
        System.out.println ("HashMap");
        System.out.println (mh.size () + " distinct words");
        /* Print the whole map (i.e: per rows. of key-value). */
        System.out.println (mh);
        System.out.println ();
        System.out.println ("TreeMap");
        System.out.println (mt.size () + " distinct words");
        System.out.println (mt);
        System.out.println ();
        System.out.println ("LinkedHashMap");
        System.out.println (mlh.size () + " distinct words");
        System.out.println (mlh);
    }
}
