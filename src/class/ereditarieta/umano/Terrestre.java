/*
 * Terrestre.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class Terrestre extends Animale //Anche qui c'e' l'estensione della classe Animale fatta da Terrestre
{
	int posizione; //Proprietà di istanza (variabili d'istanza).
	public void cammina(int metri)
	{
		//int posizione=0;
		posizione+=metri; //Il metodo influenza lo stato dell'oggetto, in queato caso influenza la 'posizione'
	}
}
