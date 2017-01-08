/*
 * AMotore.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class AMotore extends Veicolo
{
	public void accensione()
	{
		System.out.println("Acceso");
	}
	public void spegnimento()
	{
		System.out.println("Spento");
	}
	public void accelerando()
	{
		System.out.println("Accelera");
	}
	public void frenando()
	{
		System.out.println("Frena");
	}
	public void contametri() //funzione che conta i metri totali percorsi
	{
		int spazio_tot;
		System.out.println("Spazio percorso: ");
		spazio_tot=get_spazio_totale(); //viene chiamato il metodo della classe veicolo che ritorna un intero
		System.out.println(spazio_tot); //stampo l'intero appena ritornato
	}
}
