package io.github.ingloriouscoderz.model.audiodevice;

public class CDRecorder implements Recorder {
	CD cd = null;
	
	@Override
	public void accept(Media media) {
		cd = (CD)media;
	}

	@Override
	public void record(String sound) {
		if(cd == null) {
			System.out.println("Error: insert CD.");
			return;
		}
		cd.writeOnDisk(sound);
	}

}
