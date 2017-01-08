/*
 * Gatto.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class Gatto extends AnimaleDomestico
{
	//Costruttore
	public Gatto(String ilnome) //Implementazione con super(ilnome)
	{
		super(ilnome);
	}
	public void svarsela() //Implementazione di svarsela(), che non esiste nella classe AnimaleDomestico
	{
		System.out.println("Miaoooo");
	}
}
