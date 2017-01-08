/*
 * Veicolo.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class Veicolo
{
	int posizione=0;
	public void simuove(int metri) //tutti i veicoli si muovono
	{
		posizione+=metri; //posizione rappresenta lo spazio totale percorso
		System.out.println("Mi sto muovendo di "+metri+" metri");
	}
	public int get_spazio_totale() //funzione chiamata da contamteri()
	{
		return posizione; //ritorno lo spazio totale percorso
	}
}
