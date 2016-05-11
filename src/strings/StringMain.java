/*
 * StringMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class StringMain
{
    public static void main (String[] args)
    {
        /* Simple syntax */
        String s = "hallo";
        /* This is what really happens: strings are objects, not primitive types. */
        String t = new String ("hallo");
        String u = s + t + "ciao";
        String v = new String (new String (s) + new String (t) + new String ("ciao"));
        double n = 52331.4357908;
        /* String buffer objects: */
        StringBuffer sb;
        /* iterator */
        int i;
        char c;

        if ( s.equals (t) )
            System.out.println ("String s equals string t");
        if ( u.equals (v) )
            System.out.println ("String u equals string v");

        /* When you change a string... */
        u = u + "ciao";
        /* ... what really happens is that new strings are created and then
         * concatenated: strings are immutable. */
        v = new String (new String (v) + new String ("ciao"));

        if ( u.equals (v) )
            System.out.println ("String u equals string v");

        System.out.println ("String v:" + v);
        System.out.println ("length = " + v.length ());
        /* This is the equivalent array notation for strings in java: */
        System.out.println ("char at 0 = " + v.charAt (0));
        System.out.println ("first index of 'c' = " + v.indexOf ('c'));
        System.out.println ("substring of v from 2 to 5 = " + v.substring (2,5));
        System.out.println ("replace all 'h' with 'c' = " + v.replace ('h', 'c'));

        System.out.println ("itoa equivalent to transform " + n + " in string:");
        System.out.println ("v = \"\"+n");
        v = ""+n;
        if ( v.equals ("52331.4357908"))
            System.out.println ("String v equals string 52331.4357908");

        /* Reverse a string. */
        sb = new StringBuffer (s);
        for (i = 0; i < sb.length ()/2; i++)
        {
            /* Get the charater in the current index. */
            c = sb.charAt (i);
            /* Exchange current index content with the one on the "mirror"
             * index of the string. */
            sb.setCharAt (i, sb.charAt (sb.length () - i - 1));
            sb.setCharAt (sb.length () - i - 1, c);
        }

        /* toString method should be present in every java object. In this
         * case this method transforms a StringBuffer into a String object. */
        System.out.println (sb);
        System.out.println (sb.toString ());
        t = sb.toString ();
        if ( t.equals (sb) || (sb.toString ()).equals (sb))
            System.out.println ("string buffers and strings are equal if their content is equal");
        else
            System.out.println ("string buffers and strings are NOT equal even if their content is equal");
    }
}
