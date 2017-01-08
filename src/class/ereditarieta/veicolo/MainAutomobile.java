/*
 * MainAutomobile.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

/*	Si implementi una classe rappresentante un'automobile.
*	Si segua l'esempio del bipede in cui la classe è ottenuta per ereditarietà
*/
public class MainAutomobile
{
	public static void main(String[] args)
	{
		Automobile a=new Automobile(); //istanzio una nuova automobile
		System.out.println("Ho comprato una macchina");
		a.marcamodello("WV", "Polo"); //le assegno marca e modello
		a.accensione();
		a.accelerando();
		a.simuove(500); //la faccio muovere
		a.frenando();
		a.accelerando();
		a.simuove(100); //si muove ancora
		a.frenando();
		a.contametri(); //controllo di quanto si è mossa
		a.spegnimento();
		System.out.println("Possiedo una");
		a.get_marcamodello(); //controllo marcaa e modello
	}
}
