/*
 * CascadingMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class CascadingMain
{
    public static void main (String[] args)
    {
            MyStack<Integer> s0 = new MyStack<Integer> ();
            MyStack<String> s1 = new MyStack<String> ();
            MyStack<Number> s2 = new MyStack<Number> ();
            MyStack<Integer> s3 = new MyStack<Integer> ();

            /* Inserting int numbers instead of Integer objects is possible
             * thanks to boxing.
             */
            s0.push(10).push(543).push(42);
            while (!s0.isEmpty ())
                System.out.println (s0.pop ());

            System.out.println ();

            s1.push("hallo").push("how").push("are").push("you");
            while (!s1.isEmpty ())
                System.out.println (s1.pop ());

            /* The following is not possible. */
            /* s0 = s2; */

            s0.push(10).push(543).push(42);
            s3.push(1).push(345).push(24);
            /* Move from s3 to s0. */
            s0.moveFrom (s3);

            System.out.println ();

            /* This is possible thanks to the wildcards. Infact not that s0
             * is of type Number while s3 is of type integer.
             */
            s2.moveFrom (s0);
            /* Call the service function which accepts any kind of type. */
            MyStack.printAndEmpty (s2);
    }
}
