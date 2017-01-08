/*
 * Thousand.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

package numbers;

public class Thousand
{
    /* This method can generate a NumberFormatException error that is passed
     * to the upper level. If the input string is not a number a
     * NumberFormatException exception is thrown, otherwise a
     * NumberTooBigException is thrown.
     */
    public static int parseInt (String s) throws NumberFormatException, 
NumberTooBigException
    {
        int a;
        NumberTooBigException e;

        try
        {
            a = Integer.parseInt (s);
        }
        catch (NumberFormatException er)
        {
            throw er;
        }
        /* This is executed even before the NumberFormatException error. */
        finally
        {
            System.out.println ("Checking if input number is lt 1000");
            System.out.println ("Is \"" + s + "\" a number?");
        }

        /* Exception generation if our variable a does not meet the
         * requirements.
         */
        if (a >= 1000)
        {
            /* A new  NumberFormatException is generated and launched
             * (thrown). Since we have done this, the new assignment of a (or
             * any other action related to this error) must be done at the
             * higher level. This behaviour is different from the one used in
             * main.
             */
            e = new NumberTooBigException ("Number is ge 1000");
            throw e;
        }

        return a;
    }
}
