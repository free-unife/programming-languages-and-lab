/*
 * Person.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

import java.util.*;

public class Person implements Comparable
{
    private String firstname, lastname;

    public Person (String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String firstname ()
    {
        return this.firstname;
    }

    public String lastname ()
    {
        return this.lastname;
    }

    public String toString ()
    {
        return (new String (this.firstname + " " + this.lastname));
    }

    public int compareTo (Object o)
    {
        Person p = (Person) o;
        /* Compare "this" last name with the input last name. The result is
         * equivalent to a strcmp in C.
         */
        int lastnameComparison = this.lastname.compareTo (p.lastname);
        System.out.println (lastnameComparison);

        /* If the two last names are equal (== 0), check the first names. */
        return (lastnameComparison != 0 ? lastnameComparison : 
this.firstname.compareTo (p.firstname));
    }
}
