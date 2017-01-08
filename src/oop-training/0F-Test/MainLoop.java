/*
 * MainLoop.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class MainLoop
{
    public static void main (String[] args)
    {
        Database db = new Database ();

        db.parseFile ("orders.txt");
        while (true)
        {
           System.out.println (db);
           System.out.println (db.printWeightRange ());
           System.out.println (db.getModelsFromInput ());
        }
    }
}
