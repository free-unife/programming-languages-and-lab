/*
 * SuperCounter.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

/* Note that the constructor is the only method which is not inherited. The
 * rest of them, including the arrtibutes are inherited even if they are
 * private (although not directly usable).
 */
public class SuperCounter extends BiCounter
{
    /* This calls the contructor method of the superclass. This method is not
     * compulsory because it's automatically done by the system. */
    public SuperCounter ()
    {
        super();
    }

    /* The following two methods are overloaders NOT overriders. This means
     * that the methods defined in BiCounter are accessible as they are.
     * Specifically inc (int n) is an overloader for inc () of the class
     * BiCounter, which is an overriding of the original inc() of the Counter
     * class.
     */
    public void inc (int n)
    {
        val += n;
    }

    public void dec (int n)
    {
        val -= n;
    }
}
