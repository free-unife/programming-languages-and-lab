/*
 * MainConvivenza.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

//Import libreria java perchè non sono nella stesa working dir. Metodo che ci restutuisce una variabile casuale
import java.util.*;
public class MainConvivenza
{
	public Partner ilPartner; //variabile di classe Partner
	public static void main(String[] args)
	{
		//Il primo argomento da riga di comando decide tra cane a amoredellavita
		//Il secondo definisce il nome
		//Serve una struttura di controllo
		if(args==null)
		{
			System.out.println("Con chi convivi?");
			System.exit(0);
		}
		if (args.length<2) //l'array è di tipo reference. Se è nul è vuoto, quindi non si può accedere alla proprietà length. Per questo si controlla se ==null e non args.length==0
		{
			System.out.println("tipo e nome");
			System.exit(0);
		}
		//Facciamo sul serio...
		//Tradizionalmente la main è il punto di ritorno di altre funzioni. Ora voglio che quello che faceva il main diventi una istanza di un oggetto.
		//Il main quindi non è più statico ---> l'esecuzione è quindi veramente object oriented perchè gli oggetti comunicano fra di loro.
		MainConvivenza mc=new MainConvivenza(args[0],args[1]); //dalla main ho istanziato la classe stessa. E' un costruttore della classe con 2 parametri input.
		//la classe main verrà istanziata dal suo interno
	}
		public MainConvivenza(String conv, String nome) //QUesto è il costruttore
		{
			if(conv.equalsIgnoreCase("amoredellavita")) //passaggio della stringa
			{
				ilPartner=new AmoreDellaVita(nome); //Costruttore. Assegno al membro di partner una istanza amoredellavita.
			}
			if(conv.equalsIgnoreCase("cane"))
			{
				ilPartner=new Cane(nome, "12233"); //Costruttore. nome e codice reglionale che portrebbero essere passati da linea di comando
			}
			double pa=probabilitaSuccesso(ilPartner); //dall'interno del costruttore si richiama metodo che dice le probabilità di successo con il dato partner
			//Qui c'è il polimorfismo=stessa istanza che fa tante cose.
			System.out.println("Probabilità di successo: "+pa);
		}
		public double probabilitaSuccesso(Partner pr) //il parametro di questo metodo prende un qualsiasi partner (cane o amoredellavita).
		{
			//
			//La pratica seguente è sconsigliata:
			//http://stackoverflow.com/questions/541749/how-to-determine-an-objects-class-in-java
			//
			String className=pr.getClass().getName(); //prende il nome della classe
			double prob=Math.random(); //numero casuale
			if(prob<0.5)
				System.out.println("Il "+className+" non è ideale");
			return prob;
		}
}
