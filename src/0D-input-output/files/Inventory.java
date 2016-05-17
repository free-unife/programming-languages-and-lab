/*
 * Inventory.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

package files;
import java.io.*;
/* We need to tokenize strings with single space delimiters. */
import java.util.StringTokenizer;
/* Used if there are no tokens in the current line (i.e: empty line). */
import java.util.NoSuchElementException;

public class Inventory extends InventoryItem
{
    private int count, maxItems;
    private InventoryItem[] items;

    /* Create a new inventory. */
    public Inventory ( int maxItems )
    {
        this.count = 0;
        this.maxItems = maxItems;
        this.items = new InventoryItem[maxItems];
    }

    /* Add a new item to the list. */
    public void add (String name, int units, float price)
    {
        this.items[this.count++] = new InventoryItem (name, units, price);
    }

    /* Print all the database. */
    public void print ()
    {
        int i;

        for (i = 0; i < this.count; i++)
            System.out.println (i + "    " + this.items[i].toString ());
    }

    /* Read and load in memory all the inventory from the specified file. */
    public void read ( String file )
    {
        String line, name;
        int i, units;
        float price;
        BufferedReader inFile;
        StringTokenizer tokenizer;

        try
        {
            /* BefferedReader transforms a series of chars to String(s). */
            inFile = new BufferedReader (new FileReader (file));
            line = inFile.readLine ();
            while (line != null)
            {
                tokenizer = new StringTokenizer (line);
                /* Check if the number of tokens of the current line is 3.
                 * If that is not the case, jump to the next line.
                 */
                if (tokenizer.countTokens () == 3)
                {
                    name = tokenizer.nextToken ();
                    try
                    {
                        units = Integer.parseInt (tokenizer.nextToken ());
                        price = Float.parseFloat (tokenizer.nextToken ());
                        this.items[this.count++] = new InventoryItem (name, 
units, price);
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println ("Input error line: " + line);
                    }
                }
                line = inFile.readLine ();
            }
            inFile.close ();
        }
        catch (FileNotFoundException e)
        {
            System.out.println ("File " + file + " not found. Nothing to read");
        }
        catch (IOException e)
        {
            System.out.println (e);
        }
    }

    /* Write all the inventory to the specified file. This overrwrites any
     * previously present data.
     */
    public void write ( String file ) throws IOException
    {
        int i;
        /* Just like the reader part, here we are working with character
         * stream methods which gets translated into String methods.
         */
        PrintWriter outFile = new PrintWriter (new FileWriter (file));

        for (i = 0; i < this.count; i++)
            outFile.println (this.items[i].name + " " + this.items[i].units + " " + this.items[i].price);

        outFile.close ();

        System.out.println ("Data dumped to " + file);
    }
}
