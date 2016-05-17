/*
 * InventoryItem.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

package files;

public class InventoryItem
{
    protected String name;
    protected int units;
    protected float price;

    public InventoryItem ()
    {
        this.name = "";
        this.units = 0;
        this.price = 0;
    }

    public InventoryItem (String name, int units, float price)
    {
        this.name = name;
        this.units = units;
        this.price = price;
    }

    public String toString()
    {
        return (new String (this.name + ": " + this.units + " @ " + this.price + " €"));
    }
}
