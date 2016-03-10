package io.github.ingloriouscoderz.network.server;

import java.io.*;
import java.net.*;

import io.github.ingloriouscoderz.network.server.handlers.ClientHandler;
 
public class SimpleSocketServer
{
        ServerSocket s = null;
        Socket conn = null;
        int port;
        int backlog;

        public SimpleSocketServer(int port, int backlog) {
        	this.port = port;
        	this.backlog = backlog;
        }
        
    	protected ServerSocket createServer() {
            //1. creating a server socket - 1st parameter is port number and 2nd is the backlog
            try {
				s = new ServerSocket(port, backlog);
				return s;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return null;
    	}
    	
    	protected Socket acceptConnection() {
            //get the connection socket
            try {
				conn = s.accept();
	            return conn;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return null;
    	}
    	
    	protected void handleClient(Socket conn) {
		    //create new thread to handle client
		    new ClientHandler(conn).start();
    		
    	}
    	
        public void serve() {
	        //2. Wait for an incoming connection
			s = createServer();
			echo("Server socket created.Waiting for connection...");
			 
			conn = acceptConnection();
		    echo("Connection received from " + conn.getInetAddress().getHostName() + " : " + conn.getPort());
		    handleClient(conn);
	         
	        //5. close the connections and stream
	        try
	        {
	            s.close();
	        }
	        catch(IOException ioException)
	        {
	            System.err.println("Unable to close. IOexception");
	        }
    }

    public void echo(String msg)
    {
		System.out.printf("[%s] - %s%n", this.getClass().getName(),  msg);
    }
}
 
