/*
 * MyClass3.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

//Le classi cominciano con la maiuscola. La classe deve chiamarsi come il nome del file.
public class MyClass3 //E' come il main del C; cambiato il nome della classe...
{
	public static void main(String args[]) //Questo e' il vero main. Si sta dicendo che la funzione main e' un metodo della classe. Classe e' un insieme. Un metodo e' statico, cioe' ha proprietà statiche.
	{
		System.out.println("Hello World");
		if(args.length>0) //Controllo se ho passato un qualche parametro da terminale. Cioe' se la len e' maggiore di zero, con len =n° parametri.
		{
			for(int i=0; i<args.length; i++) //Dichiaro anche la variabile i
				System.out.println(args[i]); //Questa e' una API, al contrario del C nel quale vengono usate poco.
		}
	}
}
//####Istruzioni####
//Per compilare (per la java virtual machine): javac MyClass.java cioe' javac nomefile.class. Se tutto va bene, al momento della comilazione non ci deve essere output.
//Viene creato un file *.class che corrisponde al *.o in C
//Per eseguirlo bisogna usare la JVM cioè la java virtual Machine così: java nomefile (senza estensione).
