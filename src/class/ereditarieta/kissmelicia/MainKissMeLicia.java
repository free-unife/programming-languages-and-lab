/*
 * KissMeLicia.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class MainKissMeLicia
{
	public static void main(String[] args)
	{
		//Istanza della classe main
		MainKissMeLicia kml=new MainKissMeLicia();
	}
	public MainKissMeLicia()
	{
		//Ogni istanza di un oggetto è uno spazio in memoria in cui sono persenti i dati di tipo istanza.
		//Creazione nuove istanze.
		Persona mirko=new Persona("Mirko","Kato",Persona.Sesso.MASCHIO); //Nuova istanza
		Persona licia=new Persona("Licia","Mitamura",Persona.Sesso.FEMMINA); //Nuova istanza
		Persona andrea=new Persona("Andrea","Kato",Persona.Sesso.MASCHIO);
		Persona marrabbio=new Persona("Marrabbio","Mitamura",Persona.Sesso.MASCHIO);
		Gatto giuliano=new Gatto("Giuliano");
		mirko.aggiungiRapporto(andrea, Persona.TipoRapporto.FRATELLO); //Andrea e Mirko sono fratelli
		andrea.aggiungiRapporto(mirko, Persona.TipoRapporto.FRATELLO);
		andrea.aggiungiRapporto(licia, Persona.TipoRapporto.AMICO); //Andrea e Licia sono amici
		marrabbio.aggiungiRapporto(licia, Persona.TipoRapporto.FIGLIO);
		mirko.aggiungiRapporto(licia, Persona.TipoRapporto.AMICO);
		System.out.println("*****Kiss me Licia*****");
		System.out.println("Il fratello di Mirko è: "+mirko.fratello.nome);
		System.out.println("Il fratello di Andrea è: "+andrea.fratello.nome);
		System.out.println("L'amica di Andrea è: "+andrea.amico.nome);
		System.out.println("La fliglia di Marrabbio è: "+marrabbio.figlio.nome);
		System.out.println("L'amico di Mirko è: "+mirko.amico.nome);
		marrabbio.nutri(giuliano);
	}
}
