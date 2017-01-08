/*
 * Automobile.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class Automobile extends AMotore
{
	public String marca, modello;
	public Automobile compra() //metodo non usato
	{
		return new Automobile();
	}
	public void marcamodello(String lamarca, String ilmodello) //Assegnazione marca e modello all'oggetto macchina. viene fatto passando le stringhe al metodo
	{
		marca=lamarca;
		modello=ilmodello;
		System.out.println("marca= "+marca+"\t");
		System.out.println("modello= "+modello+"\n");
	}
	public void get_marcamodello()
	{
		System.out.println("marca= "+marca+"\t");
		System.out.println("modello= "+modello+"\n");
	}
}
