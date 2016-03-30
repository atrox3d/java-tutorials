package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.mediator.ChatMediator;
import io.github.ingloriouscoderz.mediator.ChatMediatorImpl;
import io.github.ingloriouscoderz.model.ChatUser;
import io.github.ingloriouscoderz.model.ChatUserImpl;

public class MainClass {

	public static void main(String[] args) {
		ChatMediator cm = new ChatMediatorImpl();
		ChatUser robb = new ChatUserImpl(cm, "robb");
		ChatUser entoni = new ChatUserImpl(cm, "entoni");
		ChatUser palmer = new ChatUserImpl(cm, "palmer");
		ChatUser boh = new ChatUserImpl(cm, "boh");
		
		robb.send("hello");
	}

}
