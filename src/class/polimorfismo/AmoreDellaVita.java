/*
 * AmoreDellaVita.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class AmoreDellaVita extends Partner
{
	public AmoreDellaVita(String nomeAmore)
	{
		super(nomeAmore);
		//nome=nomeAmore;
	}
	public boolean sposiamoci()
	{
		return true;
	}
	public String comunicaEmozioniPiacevoli()
	{
		return "No, sono stanca/o e ho mal di testa";
	}
}
