package io.github.ingloriouscoderz.network.server.handlers.threaded;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

import io.github.ingloriouscoderz.network.server.handlers.AbstractClientHandler;

public class ThreadedClientEchoHandler extends AbstractClientHandler implements Runnable 
{
     
    public ThreadedClientEchoHandler(Socket conn) 
    {
    	super(conn);
    }
 
    public void run() 
    {
        String line , input = "";
         
        try
        {
            //get socket writing and reading streams
        	echo("Opening I/O streams");
            DataInputStream in = new DataInputStream(conn.getInputStream());
            PrintStream out = new PrintStream(conn.getOutputStream());
 
        	echo("reading input from client");
            line = in.readLine();
			//reply with the same message, adding some text
            echo("replying : " + line);
            out.println(line);
             
            //client disconnected, so close socket
            echo("closing connection");
            conn.close();
        } 
       
        catch (IOException e) 
        {
            System.out.println("IOException on socket : " + e);
            e.printStackTrace();
        }
    }
}
