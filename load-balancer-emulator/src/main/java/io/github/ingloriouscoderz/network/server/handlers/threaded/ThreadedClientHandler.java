package io.github.ingloriouscoderz.network.server.handlers.threaded;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

import io.github.ingloriouscoderz.network.server.handlers.AbstractClientHandler;

public class ThreadedClientHandler extends AbstractClientHandler implements Runnable 
{
    public ThreadedClientHandler(Socket conn) 
    {
    	super(conn);
    }
 
    public void run() 
    {
        String line;
         
        try
        {
            //get socket writing and reading streams
            DataInputStream in = new DataInputStream(conn.getInputStream());
            PrintStream out = new PrintStream(conn.getOutputStream());
 
            //Send welcome message to client
            out.println("Welcome to the Server");
 
        	line = in.readLine();
			//reply with the same message, adding some text
            out.println("I got : " + line);
             
            //client disconnected, so close socket
            conn.close();
        } 
       
        catch (IOException e) 
        {
            System.out.println("IOException on socket : " + e);
            e.printStackTrace();
        }
    }
}
