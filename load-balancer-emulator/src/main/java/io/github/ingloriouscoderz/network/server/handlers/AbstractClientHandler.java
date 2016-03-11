package io.github.ingloriouscoderz.network.server.handlers;

import java.net.Socket;

import io.github.ingloriouscoderz.service.Util;

public abstract class AbstractClientHandler {
    protected Socket conn;
    
    protected AbstractClientHandler(Socket conn) 
    {
    	echo("opening handler on connection: " + conn);
        this.conn = conn;
    }
	
	public abstract void run();

    public void echo(String msg)
    {
		Util.echo(this, msg);
    }
}
