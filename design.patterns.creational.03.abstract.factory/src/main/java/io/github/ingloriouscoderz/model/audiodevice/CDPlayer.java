package io.github.ingloriouscoderz.model.audiodevice;

public class CDPlayer implements Player {

	CD cd;
	
	@Override
	public void accept(Media media) {
		cd = (CD)media;
	}

	@Override
	public void play() {
		if(cd==null) {
			System.out.println("Error: insert CD.");
			return;
		}
		System.out.println("Playing: " + cd.readTrack());
	}

}
