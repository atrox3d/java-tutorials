package io.github.ingloriouscoderz.model;

import io.github.ingloriouscoderz.mediator.ChatMediator;

public class ChatUserImpl implements ChatUser {
	private ChatMediator mediator;
	private String username;
	
	public ChatUserImpl(ChatMediator mediator, String username) {
		this.mediator = mediator;
		this.username = username;
		mediator.addUser(this);
	}

	@Override
	public void send(String msg) {
		System.out.println(this.username + ": sending message: " + msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.username + ": received message: " + msg);
	}

}
