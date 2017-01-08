/*
 * Gatto.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class Gatto //Non è una classe eseguibile perchè non c'è un punto di accesso (non c'è un main). E' una struttura per generare istanza di gatti
{
	//Una classe è caricata all'interno della VM. Le variabili static non sono condivise tra virtual machine all'interno della stessa macchina
	//Costruttore dell'istanza Gatto. Ogni classe può avere costruttori diversi.
	////
	//Attributi della classe=C'è un parallelo, in questo caso, tra attributi della classe java e attributi dela classe vera (quella ontologica)
	public static String famiglia="felini"; //Public=questo attributo è visibile dall'esterno (letto e scritto). Static=questo attributo (=famiglia) è una variabile di classe gatto (cioè dell'istanza).
	public static int code=1;
	public static int zampe=4;
	public static String orecchie="morbide";
	public static int gattiIstanziati;
	//Attributi di istanza=attributi specifici dell'instanza (in atto)
	public String nome;
	public String colore;
	//Metodi di classe=funzioni specifiche della classe. (ad esempio il riconoscimento della razza di gatto non ci viene data dal gatto stesso)
	public static String riconosciRazza(String colore) //In questo caso con il colore identifico la razza
	{
		String razza="non nota";
		if(colore.equalsIgnoreCase("grigio")) //non case sensitive.
			razza="gatto comune, ferrarese";
		if(colore.equalsIgnoreCase("rosso"))
			razza="gatto speciale, egiziano!";
		return razza; //Viene restituita la razza del gatto
	}
	//Metodi di istanza
	public void miagola() //E' void, quindi non può essere assoluto, essendo specifico dell'istanza
	{
		System.out.println("Miaoooooooo");
	}
	public void faiLeFusa()
	{
		System.out.println("Frrrr, Mrwwww, crewwwww");
	}
	//E' in costruttore. Viene chiamata quando creiamo l'istanza (in questo caso l'istanza gatto).
	public Gatto(String ilnome, String ilcolore)
	{
		nome=ilnome;
		colore=ilcolore;
		gattiIstanziati++; //Conto i gatti istanziati.
	}
}
