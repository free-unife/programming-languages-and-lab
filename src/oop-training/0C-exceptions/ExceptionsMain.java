/*
 * ExceptionsMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

import numbers.*;

public class ExceptionsMain
{
    public static void main (String[] args)
    {
        int a = 0;
        String s = "This is a string and cannot be transformed into an integer. This string will cause an exception";

        /* Instead of haning errors manually, we can use the integrated system.
         * Inside try we write instructions that may generate errors, while
         * inside catch we handle the generated error ourselfs. If no errors
         * are generated, the instructions inside catch are ignored.
         */
        try
        {
            a = Integer.parseInt (s);
            /* As you can see the following instruction does not get executed
             * because the error has already been catched. So the final value
             * of a will not be 50, but 0, An exception is like a break
             * instruction inside a try statement.
             */
            a = 50;
        }
        /* Exceptions come from java.lang.Throwable class or from its
         * subclasses java.lang.Error and java.lang.Excption, and are
         * objects. When an exception is generated, this is passed to the catch
         * instruction block as reference. Methods of Exception subclasses
         * can be used on the Exception instance thanks to subtyping.
         */
        catch (NumberFormatException e)
        {
            /*
            System.out.println (e);
            System.out.println (e.getClass ());
            System.out.println (e.toString ());
            */
            System.out.println (e.getMessage ());
            a = 0;
        }
        /* Catch an Error type exception (which is fatal). */
        catch (Error e)
        {
            e.printStackTrace ();
            System.exit(1);
        }

        /* Catch a generic type of exception not related to any previous
         * problem.
         */
        catch (Exception e)
        {
            System.out.println (e.getMessage ());
        }

        System.out.println (a);

        /* Lets try our personally defined error handling classes using the
         * service class Thousand. This demonstrates that a single class can
         * throw multiple type of errors.
         */
        try
        {
            /* Number over a thousand. */
            Thousand.parseInt ("999999");
        }
        catch (NumberTooBigException e)
        {
            /* Our personal error message, the one corresponding to
             * NumberTooBigException is printed.
             */
            System.out.println (e.getMessage ());
        }
        try
        {
            /* Input string cannot be converted to a number. */
           Thousand.parseInt (s);
        }
        /* To actually see the NumberFormat exception for the Thousand class
         * we have to catch the NumberTooBigException first.
         */
        catch (NumberTooBigException e)
        {
            System.out.println (e.getMessage ());
        }
        catch (NumberFormatException e)
        {
            /* NumberFormatException is called. */
            System.out.println (e.getMessage ());
        }
        /* Only one finally per try statement is possible. It is even
         * possible to use just try and finally statements without catch
         * statements.
         */
        finally
        {
            System.out.print ("This \"finally\" block will always be executed.");
            System.out.println (" This is always true even if exceptions are caught.");
        }
    }
}
