package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.proxy.CommandExecutor;
import io.github.ingloriouscoderz.proxy.CommandExecutorProxy;

public class MainClass {

	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("robb", "boh");
		
		try {
			executor.runCommand("ls");
			executor.runCommand("rm -r");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
