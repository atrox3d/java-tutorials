package io.github.ingloriouscoderz.mediator;

import io.github.ingloriouscoderz.model.ChatUser;

public interface ChatMediator {
	public void sendMessage(String msg, ChatUser user);
	void addUser(ChatUser user);
}
