/*
 * NameSort.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

import java.util.*;

class NameSort
{
    public static void main (String[] args)
    {
        Person arrayOfPeople[] =
        {
            /* Duplicates are possible, since the array will be transformed
             * into a list.
             */
            new Person ("Marty", "Mc. Fly"),
            new Person ("Marty", "Mc. Fly"),
            new Person ("Marty Junior", "Mc. Fly"),
            new Person ("Lorrane", "Baines Mc. Fly"),
            new Person ("Jennifer", "Parker"),
            new Person ("Biff", "Tannon")
        };
        /* Transform the previously defined array into a List object. */
        List<Person> l =  Arrays.asList (arrayOfPeople);

        /* Service method. Sorts by increasing order. */
        Collections.sort (l);
        System.out.println (l);
    }
}
