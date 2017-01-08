/*
 * AnimaleDomestico.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class AnimaleDomestico
{
	protected String nome, cibo; /* Variabili di tipo protected
					così le sottoclassi possono
					vedere queste variabili */
	public AnimaleDomestico(String ilnome) /* Metodo che assegna
						  il nome all'animale
						  domestico */
	{
		nome=ilnome;
	}
	public String getNome() /* Metodo che ritorna il nome dell'
				   istanza */

	{
		return nome;
	}
	public void mangia(String ilcibo) /* Metodo con
					implementazione generica in
				cui l'animale domestico mangia le
				polpette (che sono il cibo standard).
				In questo modo si può applicare il
				polimorfismo attraverso le
				superclassi. Per applicarlo devo usare stessi nomi, parametri, ecc...*/
	{
		cibo="polpette";
	}
}
