/*
 * MainSociale.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

/*
 * Di default non trova i filein dir diverse
 * bisogna usare opzione sourcepath
 * in questo caso javac -cp ./:./dirremota/ MainSociale.java #mi trovo nelledir namespace per compilare
 * Si lancia così: java -cp ./:dirremota/ MainSociale
 */
public class MainSociale
{
	public static void main(String[] args)
	{
		ClasseSociale cs; //dichiarazione variabile
		cs = new ClasseSociale(); //istanziazione oggetto
	}
}
