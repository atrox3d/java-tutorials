package io.github.ingloriouscoderz.model.audiodevice;

public class TapePlayer implements Player {

	Tape tape;
	
	@Override
	public void accept(Media media) {
		tape = (Tape)media;
	}

	@Override
	public void play() {
		if(tape==null) {
			System.out.println("Error: insert tape.");
			return;
		}
		System.out.println("Playing: " + tape.readTape());
	}

}
