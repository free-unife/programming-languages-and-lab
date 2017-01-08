/*
 * Counter.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

/* Esempio per spiegare alcuni concetti della programmazione ad oggetti e le applicazioni di questi nel linguaggio Java

Rispetto al modello procedurale (C) il modello ad oggetti è organizzato intorno agli oggetti e non è procedurale.
Inoltre per interagire con questi oggetti ci sono una serie di interfacce.
Qui sono i dati che controllano l'accesso al codice (ad es. public,private...) non è il codice che agisce sui dati (come le funzioni in C).
In questo modo ci sarebbe un migliore riutilizzo del codice.

Classe	--->	Oggetti (istanze di classe)
	genera
	attraverso
	i metodi
	costruttori

{campi, metodi}		{dati}+{campi, metodi}={stato}+{comportamento}
	|
	-costruttori
	-metodi interfaccia

Un programma java è definito da una serie di classi e, durante l'esecuzione, anche dagli oggetti che sono istanze di tali classi.
Questi oggetti parlano tra di loro attraverso messaggi. I messaggi consentono di eseguire operazioni dell'oggetto B invocati dall'oggetto A.
Gli oggetti hanno 2 descrizioni: interna ed esterna
	Quella interna (nascosta) descrive l'implementazione effettiva e non è visibile da altri oggetti.
	Quella esterna (visibile) è chiamata interfaccia ed è la descrizione delle operazioni dell'oggetto. Le operazioni di interfacciaforniscono quindoi dei servizi che altri oggetti richiedono all'oggetto.
Ciascun oggetto (cioè ciascuna istanza della classe) ha un suo nome. attraverso il quale è possibile referenziare l'oggetto stesso.
Gli oggetti possono creare altri oggetti (e sfruttarne i metodi). Un primo oggetto viene creato nel main, gli altri poi si creano direttamente o indirettamente.

Nei file .class ci sono i metodi condivisi dalle istanze (dagli oggetti) della stessa classe. I valori dei campi invece sono indipendenti da oggetto a oggetto.
main è l'unica funzione pubblica definita in questo modo public static void main(...). main è l'entry point (il punto di partenza) per l'esecuzione di un qualunque programma. Ogni classe può avere un proprio main, quindi 
potenzialmente ogni classe può essere il punto di paretenza di un processo. E' static perchè è globale ed è invocabile dalla JVM anche se non esiste alcuna istanza della classe a cui appartiene.

Dichiarazioni oggetti: NomeClasse NomeVariabileRiferimento;
Istanziazione oggetto: NomeVariabileRiferimento = new NomeMetodoCostruttore (param)
Per abbreviare: NomeClasse NomeVariabileRiferimento = new NomeMetodoCostruttore (param). Si tratta di una dichiarazione contestuale
N.B. new è simile ad una malloc di C.
*/
public class Counter	/*La classe contiene le proprietà statiche e queste proprietà descrivono gli oggetti.
			Gli oggetti sono istanze delle classi.
			La classe descrive i dati ed i metodi (equivalenti alle funzioni in C)*/
{
	private int val; //Questa è una proprietà e si chiama campo. L'insieme delle proprietà (in termini di valore -- cioè il valore in un dato moento) è lo stato di un oggetto.

	/*I metodi escrivono i comportamenti degli oggetti. Informalmente vengono chiamati operazioni
	Ci sono 2 tipi di metodi: di istanza e di classe.

	Se dischiaro una variabile all'interno di un metodo, questa sarà visibile solo al'interno del metodo stesso (proprio come in C)*/
	public Counter(int val) //Questo è il metodo costruttore, cioè quello che crea nuove istanze / oggetti che hanno le proprietà della classe.
	{
		this.val=val; //this è usato per riferirsi alla variabile più vicina che ha quel nome. In questo modo non è necessario distinuguere tra parametri attuali e parametri formali.
	}
	public void reset() //Questo è uno dei metodi, cioè qui viene implemenato uno dei comportamenti dell'oggetto
	{
		val=0;
	}
	public int getVal10()
	{
		return val+10;
	}
	public void inc()
	{
		val++;
	}
	public void dec()
	{
		val--;
	}
	public static void main(String args[])
	{
		Counter v; //dichiaro la variabile v di tipo Counter (riferita alla classe)
		int val=0; //inizializzo val a zero
		v=new Counter(val); //assegno v (che equvale al puntatore) ad un nuovo oggetto di tipo/classe Counter. Il counter che c'è qui è riferito al metodo costruttore. v è quindi il nome del vnuovo oggetto
		v.val=v.getVal10(); //ritornando un int il metodo va assegnato a val ma rispetto all'oggetto v, quindi v.val=...
		v.inc(); //essendo una funzione void non torna nulla. E' fatta rispetto all'oggetto, quindo utilizzo nomeoggetto.metodo();
		v.inc(); //Invocazione metodo attraverso una variabile di riferimento.
		v.inc();
		System.out.println(v.val+"=v.val\n");
		v.dec();
		System.out.println(v.val+"=v.val\n");
		Counter z;
		val=0;
		z=new Counter(val);
		z.reset();
		z.val=z.getVal10();
		System.out.println(z.val+"=z.val\n");
		Counter y;	/*Dichiaro una nuova variabile riferimento di tipo Counter. Di default le variabili di riferimento se non vengono assegnate prendono il valore NULL.
				Quando assegno esplicitamente una var. di rifer. a NULL l'oggetto precedentemente referenziato verrà rilasciatoe se è libero da dipenenze, il garbage collector
				si occupera di liberare la memoria. E' un po' come una free automatica.*/
		y=z; /*Assegnamento di riferimenti, cioè y e z si riferiscono allo stesso oggetto, referenziato inizialmente con z. Ora l'oggetto può essere referenziato anche con y.
			Questa cosa è simile ai puntatori di C*/
		System.out.println(y.val+"=y.val\n");
		/*Counter x;
		x=new z.clone(); //Sarebbe da implementare
		Con il metodo clone posso fare una copia indipendente dell'oggetto, non solo una copia del riferimento come sopra.
		Ad esempio quando ho variabili di tipo primitivo (int,float,char,etc...) posso fare int a=1; int b=0; b=a; -> b=1;*/
		Counter w = new Counter(val); //Dichiarazione contestuale

	}
}
