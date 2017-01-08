/*
 * USB.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public interface USB //L'interfaccia si poNe fra 2 diversi mezzi. L'interfaccia si pone verso l'esterno. E' legato al polimorfismo
{
	//Vedi Java Language Specifications se7 8.9 Enums
	public enum Dispositivi  {MOUSE, TASTIERA, SSD, STAMPANTE, FOTO};
	public enum TipoUSB  {TIPO_A, TIPO_B, MINI_TIPO_A, MINI_TIPO_B};
	//Metodi dichiarati ma non implementati (analogia con classe abstract). Le interfacce non devono fornire implementazioni (cioè l'interfaccia non fornisce i dettagli.
	public byte readNext(); //legge il prossimo byte disponibile
	public boolean writeByte(byte b); //
}
