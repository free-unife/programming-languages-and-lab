/*
 * Rot13Client.java
 *
 * Copyright © 2016 Franco Masotti <franco.masotti@student.unife.it>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE file for more details.
 */

import java.io.*;
import java.net.Socket;

public class Rot13Client
{
    public static void main (String[] args) throws IOException
    {
        int i;
        String serverAddress = "127.0.0.1";
        Socket socket;
        BufferedReader in, kb;
        PrintWriter sock;
        String line;

        while (true)
        {
            System.out.println ("^C to quit");
            /* Bind. */
            socket = new Socket (serverAddress, 9990);
            /* Open a write stream (input) on the socket. */
            in = new BufferedReader (new InputStreamReader (socket.getInputStream ()));
            /* Open a String read stream from the socket. */
            sock = new PrintWriter (socket.getOutputStream (), true);

            if (args.length > 0)
            {
                /* Write args[0] to socket. */
                sock.println (args[0]);
            }
            else
            {
                /* Read from keybord. */
                kb = new BufferedReader (new InputStreamReader (System.in));
                sock.println (kb.readLine ());
            }

            /* Read from socket until there is nothing more to read. */
            line = new String (in.readLine ());
            while (line != null)
            {
                System.out.println (line);
                line = in.readLine ();
            }

            /* Close the socket and the streams. */
            in.close();
            sock.close();
            socket.close();
        }
    }
}
