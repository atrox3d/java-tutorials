package io.github.ingloriouscoderz.abstractfactory.audiodevice;

import io.github.ingloriouscoderz.model.audiodevice.Media;
import io.github.ingloriouscoderz.model.audiodevice.Player;
import io.github.ingloriouscoderz.model.audiodevice.Recorder;

public class AudioClient {
	DevicesFactory technology = null;
	
	public void selectTechnology(DevicesFactory df) {
		technology = df;
	}
	
	public void test(String song) {
		Media media = technology.createMedia();
		Recorder recorder = technology.createRecorder();
		Player player = technology.createPlayer();
		
		recorder.accept(media);
		System.out.println("recording song: " + song);
		recorder.record(song);
		System.out.println("Listening recording");
		player.accept(media);
		player.play();
	}
}
