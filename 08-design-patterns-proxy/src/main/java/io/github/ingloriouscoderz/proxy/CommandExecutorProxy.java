package io.github.ingloriouscoderz.proxy;

public class CommandExecutorProxy implements CommandExecutor {

	private boolean isAdmin;
	private CommandExecutor executor;
	
	public CommandExecutorProxy(String user, String pwd) {
		if("robb".equals(user) && "pwd".equals(pwd)) {
			isAdmin = true;
		}
		executor = new CommandExecutorImpl();
	}
	
	@Override
	public void runCommand(String command) throws Exception {
		if(isAdmin) {
			executor.runCommand(command);
			return;
		}
		
		if(command.trim().startsWith("rm")) {
			throw new Exception("command not allowed");
		}
		
		executor.runCommand(command);
		
	}

}
