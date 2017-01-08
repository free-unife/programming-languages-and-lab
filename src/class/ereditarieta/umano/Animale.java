/*
 * Animale.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class Animale extends Vivente//L'aniamle e' un vivente, quindi la classe Animale eredita tutto da Vivente. Questo viene fatto attraverso extends
{
	public Animale riproduciti() //Il metodo torna un tipo animale atravero il return
	{
		return new Animale(); //new crea un nuovo oggetto nello stack ritornando il puntatore
	}
}
