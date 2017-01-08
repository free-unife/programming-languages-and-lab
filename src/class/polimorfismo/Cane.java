/*
 * Cane.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class Cane extends Partner //Sottoclasse di partner
{
	private String codiceRegionale;
	//costruttore per il cane
	public Cane(String nomeCane, String codReg) //costruttore a 2 parametri
	{
		//Nel momento in cui istanzio un cane in realtà istanzio un partner. Nel costruttore devo specificare come istanziare il partner. Si fa con super.
		super(nomeCane); //nomeCane=nomePartner
		codiceRegionale=codReg;
	}
	public String comunicaEmozioniPiacevoli()
	{
		return "Bau...bau...mmm..bau...bau..";
	}
}
