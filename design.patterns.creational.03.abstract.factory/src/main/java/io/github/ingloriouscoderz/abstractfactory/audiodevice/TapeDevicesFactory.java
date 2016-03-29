package io.github.ingloriouscoderz.abstractfactory.audiodevice;

import io.github.ingloriouscoderz.model.audiodevice.Media;
import io.github.ingloriouscoderz.model.audiodevice.Player;
import io.github.ingloriouscoderz.model.audiodevice.Recorder;
import io.github.ingloriouscoderz.model.audiodevice.Tape;
import io.github.ingloriouscoderz.model.audiodevice.TapePlayer;
import io.github.ingloriouscoderz.model.audiodevice.TapeRecorder;

public class TapeDevicesFactory implements DevicesFactory {

	@Override
	public Player createPlayer() {
		return new TapePlayer();
	}

	@Override
	public Recorder createRecorder() {
		return new TapeRecorder();
	}

	@Override
	public Media createMedia() {
		return new Tape();
	}

}
