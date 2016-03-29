package io.github.ingloriouscoderz.mediator;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import io.github.ingloriouscoderz.model.ChatUser;

public class ChatMediatorImpl implements ChatMediator {
	private List<ChatUser> users;

	public ChatMediatorImpl() {
		users = new ArrayList<ChatUser>();
	}
	
	@Override
	public void sendMessage(String msg, ChatUser user) {
		for (ChatUser chatUser : users) {
			if(chatUser != user) {
				chatUser.receive(msg);
			}
		}
	}

	@Override
	public void addUser(ChatUser user) {
		users.add(user);
	}

}
