package io.github.ingloriouscoderz.service;

public class Util {

    public static void echo(Object thiz, String msg)
    {
		String group = String.format(
				"%s:%s", 
				thiz.getClass().getSimpleName(),
				Thread.currentThread().getName()
				);
				System.out.printf("[%40s] - %s%n", group,  msg);
    }

    public static void echo(Object caller, Object thiz, String msg)
    {
    	if(caller == null) {
    		Util.echo(thiz, msg);
    	} else {
    		String group = String.format(
    										"%s::%s:%s", 
    										caller.getClass().getSimpleName(), 
    										thiz.getClass().getSimpleName(),
    										Thread.currentThread().getName()
    						);
    		System.out.printf("[%40s] - %s%n", group,  msg);
    	}
    }
}
