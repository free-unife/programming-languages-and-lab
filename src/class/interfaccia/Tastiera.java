/*
 * Tastiera.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public interface Tastiera //overload=allo stesso metodo della interfaccia ci sono 3 metodi a seconda dei casi
{
	public void pressKey(byte key);
	public void pressKey(byte key1, byte key2);
	public void pressKey(byte key1, byte key2, byte key3);
}
