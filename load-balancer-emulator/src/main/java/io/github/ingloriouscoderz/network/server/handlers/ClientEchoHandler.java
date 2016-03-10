package io.github.ingloriouscoderz.network.server.handlers;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class ClientEchoHandler extends Thread 
{
    private Socket conn;
     
    public ClientEchoHandler(Socket conn) 
    {
        this.conn = conn;
    }
 
    public void run() 
    {
        String line , input = "";
         
        try
        {
            //get socket writing and reading streams
            DataInputStream in = new DataInputStream(conn.getInputStream());
            PrintStream out = new PrintStream(conn.getOutputStream());
 
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
