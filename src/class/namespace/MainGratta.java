/*
 * MainGratta.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

package unife.linguaggi.utilita;
public class MainGratta
{
	//e' come fare l'import ma non c'è qui
	private unife.linguaggi.utilita.GrattaSchiena gs; //variabile d'istanza con nome completo
	public MainGratta()
	{
	}
	public static void main(String[] args)
	{
		MainGratta mg = new MainGratta(); //istanzio classe main
		mg.gs = new unife.linguaggi.utilita.GrattaSchiena();
		mg.gs.gratta();
	}
}
