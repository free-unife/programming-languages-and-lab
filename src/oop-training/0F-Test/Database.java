/*
 * Database.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

import java.util.*;
import java.io.*;

/* We need all order methods and variables in order to load the file into
 * memory.
 */
public class Database extends Order
{
    Set<Order> hs;

    public Database ()
    {
        this.hs = new HashSet<Order> ();
    }

    /* Some file parsing control is missing... */
    public void parseFile (String file)
    {
        String line;
        BufferedReader inFile;
        StringTokenizer tokenizer;
        char type;
        String model, manufacturer;
        Integer weight;
        Double trunkSize;
        Integer gears;
        Integer code;
        Saloon s;
        CrossCountry c;

        try
        {
            inFile = new BufferedReader (new FileReader (file));
            line = inFile.readLine ();
            while (line != null)
            {
                tokenizer = new StringTokenizer (line);
                if (tokenizer.countTokens () == 6)
                {
                    type = (tokenizer.nextToken ()).charAt (0);
                    try
                    {
                        model = tokenizer.nextToken ();
                        manufacturer = tokenizer.nextToken ();
                        /* Saloon */
                        if (type == 'b')
                        {
                            trunkSize = Double.parseDouble (tokenizer.nextToken ());
                            weight = Integer.parseInt (tokenizer.nextToken ());
                            code = Integer.parseInt (tokenizer.nextToken ());
                            s = new Order (code, model, manufacturer, weight, trunkSize, null);
                            this.hs.add ((Order) s);
                        }

                        /* CrossCountry */
                        else if (type == 'f')
                        {
                            gears = Integer.parseInt (tokenizer.nextToken ());
                            weight = Integer.parseInt (tokenizer.nextToken ());
                            code = Integer.parseInt (tokenizer.nextToken ());
                            c = new Order (code, model, manufacturer, weight, null, gears);
                            this.hs.add ((Order) c);
                        }
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

    public String printWeightRange ()
    {
        String out;
        int range0 = 0, range1 = 0, range2 = 0;

        for (Order o : this.hs)
        {
            if (o.getWeight () >= 800 && o.getWeight() < 1000)
                range0 ++;
            else if (o.getWeight () >= 1000 && o.getWeight() < 1500)
                range1 ++;
            else if (o.getWeight () >= 1500 && o.getWeight() < 2000)
                range2 ++;
        }

        out = "800-1000 kg:\t" + range0 + "\n";
        out = out + "1000-1500 kg:\t" + range1 + "\n";
        out = out + "1500-2000 kg:\t" + range2 + "\n";

        return out;
    }

    public String getModelsFromInput ()
    {
        String model, out = new String ();
        try
        {
            BufferedReader kb  = new BufferedReader (new InputStreamReader (System.in));

            System.out.println ("Input manufacturer to get all its models: ");
            manufacturer = kb.readLine ();
        }
        catch (IOException ex)
        {
            System.out.println (ex.getMessage ());
        }

        for (Order o : this.hs)
        {
            if (manufacturer.equals (o.getManufacturer ()))
                out = out + o.getModel ();
        }

        return (out + "\n");
    }

    public String toString ()
    {
        String out;

        out = "Code\tManufacturer\tModel\tTrunk\tGears\n";
        for (Order o : this.hs)
        {
            out = out + (o.toString ());
            out = out + "\n";
        }

        return out;
    }

}
