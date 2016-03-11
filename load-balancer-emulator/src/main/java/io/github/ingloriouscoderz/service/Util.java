package io.github.ingloriouscoderz.service;

public class Util {

    public static void echo(Object thiz, String msg)
    {
		System.out.printf("[%40s] - %s%n", thiz.getClass().getSimpleName(),  msg);
    }
}
