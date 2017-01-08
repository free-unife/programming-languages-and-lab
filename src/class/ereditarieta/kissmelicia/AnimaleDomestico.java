/*
 * AnimaleDomestico.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

//vedere specifiche JLS se 8.1.1.1 abstact Classes
public abstract class AnimaleDomestico //An abstract class is a class that is incomplete, or to be considered incomplete. E' quindi una classe non istanziabile.
//L'aniale domestico è qualcosa di astratto--> non è possibile istanziare un animale domestico perchè è astratto.
{
	public String nome;
	public AnimaleDomestico(String ilnome) //Costruttore. Il problema è che ogni animale ha il suo verso
	{
		nome=ilnome;
	}
	public abstract void svarsela(); //Svarsela=frarés. Qui non c'è l'implementazione.
	public void mangia(Cibo cib)
	{
		System.out.println("Buono il "+cib.getClass().getName());
	}
}
