/*
 * ServiceClassesMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class ServiceClassesMain
{
    public static void main (String[] args)
    {
        double d = 10, e;

        e = Math.log(d);
        e = Math.sin(e);
        /* Math.PI is an attribute declared as public static final double PI,
         * where:
         * static = global scope and it belongs to the class not to an object.
         * final = const
         *
         * so Math.PI does not represent a state of an istance. These type of
         * attrbutes are called class attributes.
         */
        e = Math.PI * e;

        System.out.println (e);
    }
}
