/*
 * Order.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class Order extends Car implements Saloon, CrossCountry
{
    protected Integer code;
    protected Double trunkSize;
    protected Integer gears;

    public Order ()
    {
    }

    public Order (Integer code,
                  String model,
                  String manufacturer,
                  Integer weight,
                  Double trunkSize,
                  Integer gears)
    {
        super (model, manufacturer, weight);
        this.code = code;
        this.trunkSize = trunkSize;
        this.gears = gears;
    }

    public Integer getCode ()
    {
        return this.code;
    }

    public Double getTrunkSize ()
    {
        return this.trunkSize;
    }

    public Integer getGears ()
    {
        return this.gears;
    }

    public String toString ()
    {
        return (this.code + "\t" + this.manufacturer + "\t" + this.model + "\t" + 
(this.trunkSize == null ? "-" : this.trunkSize ) + "\t" + (this.gears == null 
? "-" : this.gears));
    }
}
