/*
 * ComputerDevice.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

import java.util.*;
public class ComputerDevice implements USB, Tastiera, Display //informo il compilatore che questa classe si comporta come una delle periferiche (USB, DISPLAY, TASTIERA)
{
	//Qui viene fornita una implementazione dei metodi
	public final String modello; //final è una specie di variabile costante che una volta assegnata non può essere cambiata. Vedere le JLS.
	public ComputerDevice(String ilmodello)
	{
		modello=ilmodello;
	}
	//Si devono implementare tutti i metodi dichiarati nelle interfaccie che abbiamo esposto (imlemented)
	//USB interface method 1
	public byte readNext()
	{
		int r = (int)(Math.random()*255);
		byte b = (byte)r;
		return b;
	}
	//USB interface method 2
	public boolean writeByte(byte b)
	{
		return true;
	}
	//Tastiera interface
	public void pressKey(byte key)
	{
		System.out.println("premuto "+key);
	}
	public void pressKey(byte key1, byte key2)
	{
		System.out.println("premuto "+key1+" e "+key2);
	}
	public void pressKey(byte key1, byte key2, byte key3)
	{
		System.out.println("premuto "+key1+" e "+key2+" e "+key3);
	}
	//Display interface
	public void displayPixelAt(int x, int y)
	{
		System.out.println("pixel at "+x+","+y);
	}
	public void printCharAt(int x, int y, char c)
	{
		System.out.println("Char at "+x+","+y+" il char "+c);
	}
}
