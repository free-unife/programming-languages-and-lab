/*
 * MainUtente.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class MainUtente //
{
	private USB myUSB; //la variabile è di tipo reference e di classe USB.
	private Tastiera myTastiera;
	private Display myDisplay;
	//Costruttore della classe
	public MainUtente(String ilmodello) //t1
	{
		ComputerDevice cd=new ComputerDevice(ilmodello); //costruisco un nuovo oggetto computer (memorizato nell'heap)
		//cd è locale al costruttore (ed essendo variabile ti tipo reference è salvato nello stack)
		//la variabile cd viene persa all'uscita della classe. Tuttavia rimane salvata grazie ai riferimenti qui sotto
		myUSB=(USB)cd; //myUSB non è una variabile di tipo reference e classe USB. è locale perchè è salvata a livello di classe. casting esplicito
		myTastiera=(Tastiera)cd;
		myDisplay=(Display)cd;
	}
	public void goditiIlComputer() //t2 //godat al computer
	{
		myUSB.readNext();
		myDisplay.displayPixelAt(1,1);
		myTastiera.pressKey((byte)1);
	}
	public static void main(String[] args) //t0
	{
		MainUtente mu=new MainUtente("un modello..."); //mu=reference all'oggetto
		mu.goditiIlComputer();
	}
}
