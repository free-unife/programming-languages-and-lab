/*
 * Bipede.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class Bipede extends Terrestre
{
	public String nome;
	public void parla()
	{
		System.out.println("bla...bla...");
	}
	public Bipede(String ilnome) //Costruttore
	{
		nome=ilnome; //Viene assegnata la proprietà dell'istanza
	}
	@Override //Serve a ridefinire il metodo. Public non definisce più un animale ma uno specifico bipede
	public Bipede riproduciti()
	{
		return new Bipede("..."); //Ritorna una istanza di bipede
	}
}
