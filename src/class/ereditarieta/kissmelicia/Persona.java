/*
 * Persona.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class Persona
{
	//Vedere http://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
	public static enum Sesso {MASCHIO, FEMMINA}; //Nomi che corrispondono a numeri interi. Enumerazioni
	public static enum TipoRapporto {AMICO, FRATELLO, PADRE, FIGLIO};

	public String nome;
	public String cognome;

	public Sesso ilsesso; //Variabile di istanza
	public Persona amico, fratello, padre, figlio; //Variabili di istanza (perchè non sono statiche). Es istanzio tipo persona es Mirko, Andrea.
	public AnimaleDomestico animaletto; //Idem alla riga sopra

	public Persona(String n, String c, Sesso poco)
	{
		nome=n;
		cognome=c;
		ilsesso=poco;
	}

	public void aggiungiRapporto(Persona pr, TipoRapporto tp) //A runtime
	{
		switch(tp) //A runtime
		{
			case AMICO: amico=pr;
			break;
			case FRATELLO: fratello=pr;
			break;
			case PADRE: padre=pr;
			break;
			case FIGLIO: figlio=pr;
			break;
		}
	}
	public void nutri(AnimaleDomestico pet) //La persona deve nutrire l'animale
	{
		//Polpette pt=new Polpette("Uova...");
		pet.mangia(new Polpette("uova maiale e fagioli"));
	}

}
