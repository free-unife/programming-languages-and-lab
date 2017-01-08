/*
 * Rot13Server.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Rot13Server
{
    public static String rotate (String s)
    {
        int i;
        char c;
        String out = new String ();

        for (i = 0; i < s.length(); i++)
        {
            c = s.charAt (i);
            /* 4 instructions borrowed from
             * http://introcs.cs.princeton.edu/java/31datatype/Rot13.java.html
             */
            if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;

            /* Purely mathematical, but with caveats...
             * c += 13;
             * c %= 26;
             * c += 65;
             */
            out = out + ""+c;
        }

        return out;
    }

    public static void main (String[] args) throws IOException
    {
        ServerSocket listener = new ServerSocket (9990);
        Socket socket;
        PrintWriter sock;
        BufferedReader in;
        String line = "";

        try
        {
            while (true)
            {
                socket = listener.accept ();
                try
                {
                    in = new BufferedReader (new InputStreamReader 
(socket.getInputStream ()));
                    sock = new PrintWriter (socket.getOutputStream (), true);
                    line = in.readLine ();
                    sock.println ("ACK: " + line);
                    sock.println (rotate (line));
                }
                finally
                {
                    socket.close();
                    System.out.println (line);
                }
            }
        }
        finally
        {
            listener.close ();
        }
    }
}
