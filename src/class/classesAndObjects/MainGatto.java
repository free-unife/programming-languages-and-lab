/*
 * MainGatto.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class MainGatto
{
	//Un metodo static: es: metodo bancario: sottrai una cifra. Il metodo risultante non è statico ,dipende dallo stato attuale dell'oggetto.
	//Operazione membro diretto col '.' si accede ai metodi ed ai membri della classe, membro indiretto con '->'
	public static void main(String[] args) //il metodo main e' static in modo che l'OS sappia da dove cominciare
	{
		//Accesso agli attributi di classe
		System.out.println("Tutti i gatti sono "+Gatto.famiglia); //Utilizziamo la classe Gatto accedendo al suo dato membro (proprietà) famiglia. Sono fields della classe
		//Accesso ad un metodo membro della classe
		System.out.println("I gatti grigi sono "+Gatto.riconosciRazza("grigio")); //Riconosci razza ha un parametro in ingresso.
		//Istanziamo un gatto, cioè ne creiamo uno specifico. Va dichiarata qauindi la classe gatto. E' necessaria un'area di memoria adatta.
		//Viene usato l'operatore new equivalente alla malloc di C.
		Gatto mioMiao=new Gatto ("Fuffy","Rosso"); //mioMiao e' il nome della variabile. Gli passo il nome e la razza
		System.out.println("Il mio gatto si chiama "+mioMiao.nome);
		//Accesso ad un metodo di istanza
		System.out.println("Il mio gatto quando miagola fa:");
		mioMiao.miagola(); //Utilizzo la chiamata del metodo che mi stampa qualcosa. Classe Gatto; mioMiao è variabile di tipo reference

		//Prove per testare chiamate a metodi usando nome della classe
		//System.out.println("Fai le fusa "+Gatto.faiLeFusa);
		//System.out.println("Miagola "+Gatto.miagola);
		//System.out.println("Razza "+Gatto.riconosciRazza("Rosso"));
	}
}
