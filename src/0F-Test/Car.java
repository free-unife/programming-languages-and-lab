/*
 * Car.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class Car
{
    protected String model, manufacturer;
    protected Integer weight;

    public Car ()
    {
    }

    public Car (String model, String manufacturer, Integer weight)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public String getModel ()
    {
        return this.model;
    }

    public String getManufacturer ()
    {
        return this.manufacturer;
    }

    public Integer getWeight ()
    {
        return this.weight;
    }
}
