package io.github.ingloriouscoderz.model.audiodevice;

public class TapeRecorder implements Recorder {
	Tape tape = null;
	
	@Override
	public void accept(Media media) {
		tape = (Tape)media;
	}

	@Override
	public void record(String sound) {
		if(tape == null) {
			System.out.println("Error: insert tape.");
			return;
		}
		tape.saveOnTape(sound);
	}

}
