/*
 * MyStack.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

import java.util.*;

/* <T> and T mean generic typing. This is better than using Object since it
 * enforces type controls (Object does not).
 * This class is also known as generic class.
 */
public class MyStack<T>
{
    /* As you can see the stack is implemented with a List object (which is a
     * queue.
     */
    private List<T> storage;

    public MyStack ()
    {
        storage = new ArrayList<T> ();
    }

    public MyStack<T> push (T element)
    {
        storage.add (element);
        /* Cascading operation. This enables to do something similar of
         * functional programming: ((stack.push(23)).push(5)).push(421)
         * Of course the extra parenthesis can be avoided.
         */
        return this;
    }

    /* Return and delete last element in list. */
    public T pop ()
    {
        return (this.storage.remove (storage.size () - 1));
    }

    public boolean isEmpty ()
    {
        return (this.storage.isEmpty ());
    }

    /* Move elements from one stack to another. Three possible signatures:
     * . public void moveFrom (MyStack <T> src) -- only accepts the exact same
     * I/O type.
     * . public <E extends T> void moveFrom (MyStack <E> src) -- src can have a
     * type which is a subclass of T.
     * . public void moveFrom (MyStack <? extends T> src) -- compact form of 
     * the earlier example.
     */
    public void moveFrom (MyStack <? extends T> src)
    {
        while (!src.isEmpty ())
            this.push (src.pop ());
    }

    /* <?> is a wildcard that enable to work on any kind of Object. It is like
     * a void * pointer in C, but more  powerful.
     * <?> == <? extends Object>
     */
    public static void printAndEmpty (MyStack<?> s)
    {
        while (!s.isEmpty ())
            System.out.println (s.pop ());
    }
}
