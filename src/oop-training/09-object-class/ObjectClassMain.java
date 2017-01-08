/*
 * ObjectClassMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

/* Import classes from person package (located in the person directory). */
import objectset.*;

public class ObjectClassMain
{
    public static void main (String[] args)
    {
        Account a = new Account (21000.54);
        AccountExt ae = new AccountExt (3897.29);

        /* The following two instructions will call the toString method (which
         * exists by default for any object). */
        System.out.println (a);
        System.out.println (ae);

        /* The following calls the toString overridden method of the AccountExt
         * class. */
        System.out.println (ae.toString("Number One"));

        /* Explains the usage of 'this' keyword. */
        ae.thisTest (10.01);
    }
}
