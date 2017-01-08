/*
 * Gatto.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class Gatto extends AnimaleDomestico /* Gatto è sottoclasse di
					       AnimaleDomestico */
{
	public Gatto(String nomeGatto)
	{
		super(nomeGatto);
	}
	public void verso()
	{
		System.out.println("Miao");
	}
	public void mangia(String ilcibo) /* Qui viene ridefinito il metodo mangia */
	{
		//System.out.println("Il gatto "+nomeGatto+" mangia "+ilcibo);
		System.out.println("Il gatto mangia "+ilcibo);

	}
}
