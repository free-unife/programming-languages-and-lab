/*
 * LiciaMain.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

/*
*	Consegna:
*	=========
*
*	Licia è amica di Andrea che ha un fratello di nome Mirko,
*	cantante di una nota band giovanile e molto apprezzato
*	dai coetanei. Andrea ha un animale domestico che mangia
*	la colazione offerta dal papà di Licia. Di solito sono
*	polpette ma potrebbe anche essere altro. ---> polimorfismo
*
*	Si implementi una struttura di classi che permetta di
*	rappresentare questa realtà, che permetta ad Andrea di avere
*	un gatto o un cane che produca un verso adeguato
*	(rispettivamente miao e bau) e che possa alimentarsi con i
*	piatti del papà di Licia.
*
*/
public class LiciaMain
{
	public AnimaleDomestico ad;
	public static void main(String[] args)
	{
		LiciaMain lc=new LiciaMain();
	}
	public LiciaMain()
	{
		ad=new Gatto("test"); /* Istanzio un nuovo gatto */
		ad.mangia("");
		ad.mangia("ciccia");
	}
}
