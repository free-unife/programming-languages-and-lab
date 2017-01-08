/*
 * Person.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

package person;

public class Person
{
    protected String name;
    protected int age;

    /* Constructor. */
    public Person (String n, int yrsold)
    {
        name = n;
        age = yrsold;
    }

    public void print ()
    {
        System.out.print ("My name is " + name);
        System.out.println (" and I'm " + age + " years old");
    }
}
