/*
 * IOMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

import files.*;
/* IO exception class. */
import java.io.IOException;

public class IOMain
{
    public static void main (String[] args)
    {
        Inventory in = new Inventory (120);

        /* Every time the read method is called all the entries of the
         * specified file are loaded in memory. This means that if you call
         * read() consecutively on the same file you will get doubled
         * entries.
         */
        in.read ("inventory.dat");

        in.add ("Pasta-al-forno", 1, 43);
        in.add ("Tomato", 250, Float.parseFloat("0.1"));
        in.add ("Potato", 130, Float.parseFloat("0.2"));
        in.add ("You-say-potato-I-say-potato", 1, Float.parseFloat("0.2"));
        in.add ("You-say-tomato-I-say-tomato", 1, Float.parseFloat("0.1"));

        in.print ();

        /* write method throws an exception that must be caught. */
        try
        {
            in.write ("inventory.dat");
        }
        catch (IOException ex)
        {
            System.out.println (ex.getMessage ());
        }

    }
}
