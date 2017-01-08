/*
 * MainLeZi.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

/*
 *
 *
 * Legge un file e lo salva in modo invertito su uno altro file usando dei buffer. Es: ciao -> oiac
 *
 */
import java.io.*; // Package java I/O importato
public class MainLeZi
{
	private File infile, outfile;
	private boolean error = false; // stato interno dell'applicazione. Lo stato cambia in base a questa variabile.

	public MainLeZi(String inf, String outf) // in=infile, out=outfile
	{
		try // le operazioni di I/O possono generare eccezioni che vanno controllate con try catch
		{
			infile = new File(inf);
			outfile = new File(outf);
		}
		catch (NullPointerException ex)
		{
			error = true; // se c'è una eccezione pongo il codice di errore a true.
		}
	}

	public static void main (String[] args)
	{
		// Verificare se al programma sono stati passati i nomi dei file (i due argomenti)
		if (args.length < 2)
		{
			System.out.println ("Uso: java mainLeZi <infile> <outfile>\n"); // info su uso corretto del programma
			System.exit (0);
		}

		MainLeZi ml = new MainLeZi (args[0], args[1]); // creazione oggetto nella classe

		if (!ml.error) // verifico se il flag è true o false. Da qui non posso accedere al campo error direttamente. Quindi utilizzo il nome dell'istanza "ml"
		{
			try
			{
				ml.inverti (); // inverte i file
			}
			catch (Exception ex)
			{
				System.out.println (ex.toString ()); // stampa exit code
			}
		}
		else
		{
			System.exit (1); // exit code = 1 per errore
		}
	}

	protected void inverti () throws Exception // rilancia eccezione e le propaga, al contrario del "catch" che invece la tiene per sé
	{
		// quando dichiaro un method posso rilanciare l'eccezione manualmente, senza flag.
		// deve leggere il file
		FileInputStream fis; // per leggere il file si utilizza file input stream che fa parte del package dichiarato sopra
		FileOutputStream fos; // per scrivere il file
		long il = infile.length (); // check file size. "infile" è una variabile di istanza. Non è thread safe perchè potrebbero esserci problemi nei multithread se questi accedono simultaneamente allo stesso file, perchè si "ruberebbeero" lo stato a vicenda dell'oggetto.
		fis = new FileInputStream (infile);
		// leggere tutto il file e metterlo su un array
		if (il > Integer.MAX_VALUE) // se il file non sta nell'array
			throw new Exception ("Peccato");  // viene passata l'eccezione al main che deve gestire l'eccezione.

		byte[] buf = new byte [(int) il]; // buffer
		byte[] ibuf = new byte [(int) il]; // inverted buffer

		int readed = fis.read (buf); // uso la read per mettere il file nel buffer
		if (readed < il) // controllo se il numero di byte letti sia uguale alla dimensione del file
			throw new Exception ("Maledetto SO");

		int i = 0;
		for (i = 0; i < readed; i++)
		{
			ibuf[i] = buf [readed - i - 1]; // nuovo buffer (che si trova nell'heap)
		}

		fos = new FileOutputStream(outfile); // fos = file output stream. Creazione nuovo oggetto
		fos.write (ibuf); // scrive il contenuto del buff nel file di uscita
		fos.close ();
	}
}
