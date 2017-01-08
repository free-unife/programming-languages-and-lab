/*
 * Display.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public interface Display //L'interfaccia gestisce il display ad alto livello
{
	public void displayPixelAt(int x, int y); //matrice di pixel
	public void printCharAt(int x, int y, char c);
}
