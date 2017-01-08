/*
 * MainUmano.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class MainUmano
{
	//Va messo il main essendo la classe principale
	public static void main(String[] args)
	{
		//E fu creato l'uomo
		Bipede uomo=new Bipede("Adamo");
		//Diamo da mangiare ad Adamo
		String c_cc_=uomo.consuma("banana");
		System.out.println("Se mangi banane..."+c_cc_);
		//E dalla costola ... fu creata la donna
		Bipede donna=new Bipede("Eva");
		System.out.println("Ciao "+uomo.nome+" io sono "+donna.nome);
		//Adamo conosce Eva
		//ma prima cammina per raggiungerla
		uomo.cammina(10); //metodo ha modificato la proprietò distanza
		System.out.println("Adamo in "+uomo.posizione);
		Bipede figlio=donna.riproduciti();  //Viene creato un nuovo bipede. figlio e' una variabile di tipo reference. L'operatore new per la vera creazione e' in Bipede.java
		System.out.println("Ciao io sono "+figlio.nome); //Il nome e' definito nel metodo riproducuti, oppure lo si puo' assegnare anche qui.
		figlio.nome="Caino"; //Assegnazione nuovo nome attraverso la variabile/istanza figlio
		System.out.println("...ma ora.."+figlio.nome);
	}
}
