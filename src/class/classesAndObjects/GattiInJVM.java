/*
 * GattiInJVM.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class GattiInJVM
{
	public static void main(String[] args)
	{
		//Da un oggetto posso accedere ad un membro di classe? si.
		//Dalla classe senza l'oggetto non posso accedere ad una istanza.
		Gatto gatto1=new Gatto("Panceri","grigio");
		Gatto gatto2=new Gatto("Matto","rosso");
		//Ogni oggetto aumenta di un 1 il numero di istanze.
		System.out.println("Ci sono "+Gatto.gattiIstanziati+" gatti nella JVM");
		Gatto gatto3=new Gatto("Consolato","rosso");
		System.out.println("ora sono "+Gatto.gattiIstanziati);
		System.out.println(gatto1.nome+", "+gatto2.nome+", "+gatto3.nome);
	}
}
