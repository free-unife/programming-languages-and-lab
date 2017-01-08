/*
 * MyClass.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

//Le classi cominciano con la maiuscola. La classe deve chiamarsi come il nome del file.
public class MyClass //E' come il main del C
{
	public static void main(String args[]) //Questo e' il vero main. Si sta dicendo che la funzione main e' un metodo della classe. Classe e' un insieme. Un metodo e' statico, cioe' ha proprietà statiche.
	{
		System.out.println("Hello World");
	}
}
//####Istruzioni####
//Per compilare (per la java virtual machine): javac MyClass.java cioe' javac nomefile.class. Se tutto va bene, al momento della comilazione non ci deve essere output.
//Viene creato un file *.class che corrisponde al *.o in C
//Per eseguirlo bisogna usare la JVM cioè la java virtual Machine così: java nomefile (senza estensione).
