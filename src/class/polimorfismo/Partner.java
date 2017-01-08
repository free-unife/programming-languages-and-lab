/*
 * Partner.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

public class Partner
{
	/*Protected e private, così come public sono modificatori di visibilità. Attraverso di essi si stabiliscono le limitazioni all'accesso dei membri (policy)
	Vedere le JLS se7 6.6.1 (Java Language Specifications)*/
	/*Ogni classe deve avere una @overrride*/
	protected String nome;
	private String soprannome;

	public Partner(String ilnome)
	{
		nome=ilnome;
		soprannome="trottolino amoroso";
		//controllare l'accesso a questo campo
	}
	public String ripetimiIlTuoNome()
	{
		return nome;
	}
	public String pensaciTu(String problema)
	{
	return "...";
	}
}
