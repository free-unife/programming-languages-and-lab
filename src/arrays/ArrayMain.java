/*
 * ArrayMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class ArrayMain
{
    public static void main (String[] args)
    {
        int i;
        int array_length = 128;
        /* Dangling reference. */
        int[] a;
        int n;
        /* C-like notation. This is called "initializator". */
        double[] b = { 2.1, 6.8, 3.653, 6124.8675 };
        /* We can also have arrays of objects. We will use String objects for
         * simplicity. */
        String[] array_of_strings;

        /* This type of declaration, with a dynamic array length, is illegal in
         * standard C. */
        a = new int [array_length];
        a [array_length/2] = 12;
        n = a[array_length/2];

        System.out.println ("a[" + array_length/2 + "] = " + a[array_length/2] + " ;n = " + n);

        /* NOTE: length is an immutable attribute, not a method. This means
         * that you cannot do a.length = smt. */
        System.out.println (a.length + " " + array_length);

        /* Array bound checking is implemented in java, unlike in C. */
/*        System.out.println ("a[" + array_length + "] = " + a[array_length] + " ;a[-1] = " + a[-1]);*/

        /* As you can see you must allocate the single object as well as it's
         * reference (just like in C). */
        array_of_strings = new String[4];
        for (i = 0; i < 4; i++)
            array_of_strings[i] = new String("0" + ""+i);

        for (i = 0; i < 4; i++)
            System.out.println (array_of_strings[i]);

        /* args test. args[0] is the first variable, not the path of the
         * program.
         * Java     C
         * args ~= argv
         * args.length == argc
         */
        for (i = 0; i < args.length; i++)
            System.out.println("input " + i + " = " + args[i]);
    }
}
