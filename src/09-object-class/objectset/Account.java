/*
 * Account.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

package objectset;

/* All classes extend the Object class. It is not necessary to indicate it*/
public class Account extends Object
{
    double money;

    /* Constructors. */
    public Account ()
    {
        money = 0.00;
    }

    public Account (double m)
    {
        money = m;
    }

    /* Redefine (override) the toString method */
    public String toString()
    {
        return ("money = " + ""+money);
    }
}
