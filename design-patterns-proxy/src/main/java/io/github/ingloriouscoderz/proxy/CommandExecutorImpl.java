package io.github.ingloriouscoderz.proxy;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void runCommand(String command) throws IOException {
		Runtime.getRuntime().exec(command);
		
		System.out.println(command + " : executed");
	}

}
