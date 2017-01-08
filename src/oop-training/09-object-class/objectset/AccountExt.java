/*
 * AccountExt.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

package objectset;

public class AccountExt extends Account
{
    public AccountExt ()
    {
        super ();
    }

    /* Overloader. */
    public AccountExt (double m)
    {
        super (m);
    }

    /* This is an overloaded method of the to string defined in the Account
     * class. */
    public String toString (String clientname)
    {
        return ("Total balancing for " + clientname + " = " + money + " money(s)");
    }

    /* This method is an example of the usage of 'this' keyword. If we have
     * variables inside a class and we want to pass a parameter to a
     * function, the parameter name can be the same of the attribute name as
     * long as we use 'this' keyword in the following manner: */
    public void thisTest (double money)
    {
        System.out.println (this);
        System.out.println (this.money);
        System.out.println (money);
    }
}
