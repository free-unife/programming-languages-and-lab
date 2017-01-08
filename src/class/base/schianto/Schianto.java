/*
 * Schianto.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class Schianto //Dichiaro la classe schianto
{
	public static void main(String args[])
	{
		int i=1,j=0,z;
		try //GESTIONE ERRORI: Se c'è una istruzione che potrebbe presentare errori allora viene messa dentro al try
		{
			z=i/j;
			System.out.println("Risultato "+z);
		}catch(Exception e) //Qui viene gestita l'eccezione 'e'. Si tratta di una specie di if else senza verifica visibile della condizione.
		{
			System.out.println("Hai sbagliato, non puoi dividere per 0"); //qui scrivo l'errore (oppure eseguo codice opportuno) che voglio che venga visualizzato.
		}
	}
}
