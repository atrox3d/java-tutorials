package io.github.ingloriouscoderz.model.audiodevice;

public class CD implements Media {
	private String track = "";
	
	public void writeOnDisk(String sound) {
		track = sound;
	}
	
	public String readTrack() {
		return track;
	}
}
